package landevu.repository

import landevu.dto.Area
import landevu.repository.dao.AreaDao
import landevu.repository.mapper.AreaMapper
import org.springframework.stereotype.Repository

@Repository
class AreaRepositoryImpl(private val areaMapper: AreaMapper) : AreaRepository {
    override fun findById(areaId: String): Area {
        val areaDao: AreaDao = areaMapper.findById(areaId)
        return Area(areaDao.areaId, areaDao.areaName)
    }

    override fun insertArea(area: Area) {
        return areaMapper.insertArea(AreaDao(area.areaId, area.areaName))
    }

    override fun updateArea(area: Area) {
        return areaMapper.updateArea(AreaDao(area.areaId, area.areaName))
    }
}