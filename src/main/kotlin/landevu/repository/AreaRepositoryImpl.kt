package landevu.repository

import landevu.dto.Area
import landevu.repository.dao.AreaDao
import landevu.repository.mapper.AreasMapper
import org.springframework.stereotype.Repository

@Repository
class AreaRepositoryImpl(private val areasMapper: AreasMapper) : AreaRepository {
    override fun findById(areaId: String): Area {
        val record: AreaDao = areasMapper.findById(areaId)
        return Area(record.areaId, record.areaName)
    }

    override fun searchByTrainLineId(trainLineIds: List<String>): List<Area> {
        val records: List<AreaDao> = areasMapper.searchByTrainLineId(trainLineIds)
        return records.map { Area(it.areaId, it.areaName) }
    }

    override fun insertArea(area: Area) {
        return areasMapper.insertArea(AreaDao(area.areaId, area.areaName))
    }

    override fun updateArea(area: Area) {
        return areasMapper.updateArea(AreaDao(area.areaId, area.areaName))
    }
}