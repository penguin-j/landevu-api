package landevu.repository

import landevu.dto.Coordinate
import landevu.dto.Spot
import landevu.repository.mapper.SpotMapper
import org.springframework.stereotype.Repository

@Repository
class SpotRepositoryImpl(private val spotMapper: SpotMapper) : SpotRepository {
    override fun findById(spotId: String): Spot {
        val spotDao = spotMapper.findById(spotId)
        return Spot(spotDao.spotId, spotDao.spotName, Coordinate(spotDao.longitude, spotDao.latitude))
    }

    override fun findAll(): List<Spot> {
        val spotDaoList = spotMapper.findAll()
        return spotDaoList.map { Spot(it.spotId, it.spotName, Coordinate(it.longitude, it.latitude)) }
    }
}