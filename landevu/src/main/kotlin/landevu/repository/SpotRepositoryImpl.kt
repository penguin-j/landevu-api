package landevu.repository

import landevu.dto.Coordinate
import landevu.dto.Spot
import landevu.repository.dao.SpotDao
import landevu.repository.mapper.SpotMapper
import org.springframework.stereotype.Repository

@Repository
class SpotRepositoryImpl(private val spotMapper: SpotMapper) : SpotRepository {
    override fun findById(spotId: String): Spot {
        val record: SpotDao = spotMapper.findById(spotId)
        return Spot(record.spotId, record.spotName, Coordinate(record.longitude, record.latitude))
    }

    override fun findAll(): List<Spot> {
        val records: List<SpotDao> = spotMapper.findAll()
        return records.map { Spot(it.spotId, it.spotName, Coordinate(it.longitude, it.latitude)) }
    }
}