package landevu.repository

import landevu.dto.Station
import landevu.repository.dao.StationDao
import landevu.repository.mapper.StationsMapper
import org.springframework.stereotype.Repository

@Repository
class StationRepositoryImpl(private val stationsMapper: StationsMapper) : StationRepository {
    override fun findById(stationId: String): Station {
        val record: StationDao = stationsMapper.findById(stationId)
        return Station(record.stationId, record.stationName, record.trainLineId, record.areaId)
    }

    override fun findByTrainLineId(trainLineId: String): List<Station> {
        val records: List<StationDao> = stationsMapper.findByTrainLineId(trainLineId)
        return records.map { Station(it.stationId, it.stationName, it.trainLineId, it.areaId) }
    }

    override fun searchByAreaId(areaId: String): List<Station> {
        val records: List<StationDao> = stationsMapper.searchByAreaId(areaId)
        return records.map { Station(it.stationId, it.stationName, it.trainLineId, it.areaId) }
    }

    override fun searchByName(stationName: String): List<Station> {
        val records: List<StationDao> = stationsMapper.searchByName(stationName)
        return records.map { Station(it.stationId, it.stationName, it.trainLineId, it.areaId) }
    }
}