package landevu.service

import landevu.dto.*
import landevu.repository.AreaRepository
import landevu.repository.AreaRepresentativeSpotRepository
import landevu.repository.SpotRepository
import org.springframework.stereotype.Service
import kotlin.math.*

@Service
class RecommendAreaServiceImpl(
    private val areaRepository: AreaRepository,
    private val spotRepository: SpotRepository,
    private val areaRepresentativeSpotRepository: AreaRepresentativeSpotRepository
) : RecommendAreaService {
    override fun execute(recommendAreaRequest: RecommendAreaRequest): List<Pair<Area, Spot>> {
        // 出発地点間の中間地点の座標を算出する
        val mediumCoordinate: Coordinate = calculateMediumCoordinate(recommendAreaRequest.coordinates)

        // エリア代表地点一覧を取得する
        val allAreaRepresentativeSpots: List<Spot> = spotRepository.findAll()

        // 中間地点に近いエリアを探索する
        return searchNearestArea(mediumCoordinate, allAreaRepresentativeSpots)
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
        targetCoordinate: Coordinate,
        allAreaRepresentativeSpots: List<Spot>
    ): List<Pair<Area, Spot>> {
        val allCoordinates: List<Coordinate> = allAreaRepresentativeSpots.map { it.coordinate }

        val nearestCoordinate: Coordinate = searchNearestNeighbor(targetCoordinate, allCoordinates)
        val nearestSpot: Spot =
            allAreaRepresentativeSpots.filter { it.coordinate == nearestCoordinate }[0]
        val nearestAreaId: String =
            areaRepresentativeSpotRepository.findBySpotId(nearestSpot.spotId).areaId
        val nearestArea = areaRepository.findById(nearestAreaId)

        return listOf(Pair(nearestArea, nearestSpot))
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