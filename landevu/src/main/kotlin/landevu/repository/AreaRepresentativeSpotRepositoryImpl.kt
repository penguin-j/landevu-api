package landevu.repository

import landevu.dto.AreaRepresentativeSpot
import landevu.repository.dao.AreaRepresentativeSpotDao
import landevu.repository.mapper.AreaRepresentativeSpotMapper
import org.springframework.stereotype.Repository

@Repository
class AreaRepresentativeSpotRepositoryImpl(private val areaRepresentativeSpotMapper: AreaRepresentativeSpotMapper) :
    AreaRepresentativeSpotRepository {
    override fun findByAreaId(areaId: String): List<AreaRepresentativeSpot> {
        val records: List<AreaRepresentativeSpotDao> = areaRepresentativeSpotMapper.findByAreaId(areaId)
        return records.map { AreaRepresentativeSpot(it.areaId, it.spotId) }
    }

    override fun findBySpotId(spotId: String): AreaRepresentativeSpot {
        val record: AreaRepresentativeSpotDao = areaRepresentativeSpotMapper.findBySpotId(spotId)
        return AreaRepresentativeSpot(record.areaId, record.spotId)
    }

    override fun findAll(): List<AreaRepresentativeSpot> {
        val records: List<AreaRepresentativeSpotDao> = areaRepresentativeSpotMapper.findAll()
        return records.map { AreaRepresentativeSpot(it.areaId, it.spotId) }
    }
}