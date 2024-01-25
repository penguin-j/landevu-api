package landevu.infrastructure.repository.impl

import landevu.dto.Coordinate
import landevu.dto.Spot
import landevu.infrastructure.dao.SpotDao
import landevu.infrastructure.mapper.SpotsMapper
import landevu.infrastructure.repository.SpotRepository
import org.springframework.stereotype.Repository

@Repository
class SpotRepositoryImpl(private val spotsMapper: SpotsMapper) : SpotRepository {
    override fun findById(spotId: String): Spot {
        val record: SpotDao = spotsMapper.findById(spotId)
        return Spot(record.spotId, record.spotName, record.areaId, Coordinate(record.longitude, record.latitude))
    }

    override fun findAll(): List<Spot> {
        val records: List<SpotDao> = spotsMapper.findAll()
        return records.map { Spot(it.spotId, it.spotName, it.areaId, Coordinate(it.longitude, it.latitude)) }
    }

    override fun findByAreaId(areaId: String): List<Spot> {
        val records: List<SpotDao> = spotsMapper.findByAreaId(areaId)
        return records.map { Spot(it.spotId, it.spotName, it.areaId, Coordinate(it.longitude, it.latitude)) }
    }
}