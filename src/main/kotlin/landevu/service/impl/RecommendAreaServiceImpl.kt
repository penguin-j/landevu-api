package landevu.service.impl

import landevu.dto.*
import landevu.infrastructure.repository.AreaRepository
import landevu.infrastructure.repository.SpotRepository
import landevu.service.RecommendAreaService
import org.springframework.stereotype.Service
import software.amazon.awssdk.services.location.LocationClient
import software.amazon.awssdk.services.location.model.SearchPlaceIndexForTextRequest
import kotlin.math.*

@Service
class RecommendAreaServiceImpl(
    private val areaRepository: AreaRepository,
    private val spotRepository: SpotRepository,
) : RecommendAreaService {
    override fun execute(recommendAreaRequest: RecommendAreaRequest): List<RecommendAreaResponseElement> {
        // 出発地点の座標を取得する
        val departureSpotCoordinates: List<Coordinate> = recommendAreaRequest.spotNames.map {
            searchCoordinateFromSpotName(it)
        }
        println(departureSpotCoordinates)

        // 出発地点間の中間地点の座標を算出する
        val mediumCoordinate: Coordinate = calculateMediumCoordinate(departureSpotCoordinates)

        // 中間地点に近いエリアを探索する
        // TODO: ここで複数エリアを取得できるようにする
        val nearestArea = searchNearestArea(mediumCoordinate)

        // おすすめエリアに属するスポットを取得する
        val recommendAreaResponseElements = nearestArea.map {
            RecommendAreaResponseElement(it, spotRepository.findByAreaId(it.areaId))
        }
        return recommendAreaResponseElements
    }

    /**
     * 中間地点の座標を算出する
     */
    private fun calculateMediumCoordinate(coordinateList: List<Coordinate>): Coordinate {
        val longitudeList: MutableList<Double> = mutableListOf()
        coordinateList.forEach { i ->
            longitudeList.add(i.longitude)
        }
        val mediumLongitude: Double = longitudeList.average()

        val latitudeList: MutableList<Double> = mutableListOf()
        coordinateList.forEach { i ->
            latitudeList.add(i.latitude)
        }
        val mediumLatitude: Double = latitudeList.average()

        return Coordinate(mediumLongitude, mediumLatitude)
    }

    /**
     * 近くのエリアを探索する
     */
    private fun searchNearestArea(
        targetCoordinate: Coordinate
    ): List<Area> {
        // エリア代表地点一覧を取得する
        val allAreaRepresentativeSpots: List<Spot> = spotRepository.findAll()

        // エリア代表地点の座標を取得する
        val allCoordinates: List<Coordinate> = allAreaRepresentativeSpots.map { it.coordinate }

        // 最近傍探索により、ターゲットから最も近いエリア代表地点を特定する
        val nearestCoordinate: Coordinate = searchNearestNeighbor(targetCoordinate, allCoordinates)
        val nearestSpot: Spot = allAreaRepresentativeSpots.filter { it.coordinate == nearestCoordinate }[0]

        // エリア代表地点が属するエリアを特定する
        val nearestArea = areaRepository.findById(nearestSpot.areaId)

        return listOf(nearestArea)
    }

    /**
     * 地点名から座標を取得するメソッド
     */
    private fun searchCoordinateFromSpotName(spotName: String): Coordinate {
        val locationClient = LocationClient.builder().build()

        val searchedResults = locationClient.searchPlaceIndexForText(
            SearchPlaceIndexForTextRequest.builder().indexName("st-landevu-place-index-esri").text(spotName).build()
        ).results()
        println(searchedResults)

        val searchedResult = searchedResults[0]

        val searchedCoordinate =
            Coordinate(searchedResult.place().geometry().point()[0], searchedResult.place().geometry().point()[1])
        println(searchedCoordinate)

        return searchedCoordinate
    }

    /**
     * 最近傍探索メソッド
     */
    private fun searchNearestNeighbor(query: Coordinate, dataset: List<Coordinate>): Coordinate {
        val distanceMap: MutableMap<Double, Coordinate> = mutableMapOf()
        dataset.forEach {
            // queryとdataset各要素の距離を計算
            val distance: Double = sqrt((it.longitude - query.longitude).pow(2) + (it.latitude - query.latitude).pow(2))
            distanceMap[distance] = it
        }
        // 最も近い地点の座標を返す
        return distanceMap.toSortedMap().values.toList()[0]
    }
}