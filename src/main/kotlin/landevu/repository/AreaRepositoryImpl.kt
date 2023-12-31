package landevu.repository

import landevu.dto.Area
import landevu.dto.Coordinate
import landevu.dto.Spot
import landevu.repository.dao.AreaDao
import landevu.repository.mapper.AreaMapper
import org.springframework.stereotype.Repository

@Repository
class AreaRepositoryImpl(private val areaMapper: AreaMapper) : AreaRepository {
    override fun findById(areaId: String): Area {
        val record: AreaDao = areaMapper.findById(areaId)
        return Area(record.areaId, record.areaName)
    }

    override fun searchByTrainLineId(trainLineIds: List<String>): List<Area> {
        val records: List<AreaDao> = areaMapper.searchByTrainLineId(trainLineIds)
        return records.map { Area(it.areaId, it.areaName) }
    }

    override fun insertArea(area: Area) {
        return areaMapper.insertArea(AreaDao(area.areaId, area.areaName))
    }

    override fun updateArea(area: Area) {
        return areaMapper.updateArea(AreaDao(area.areaId, area.areaName))
    }
}