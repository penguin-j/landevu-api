package landevu.infrastructure.mapper

import landevu.infrastructure.dao.AreaDao
import org.apache.ibatis.annotations.Mapper

@Mapper
interface AreasMapper {
    fun findById(areaId: String): AreaDao

    fun searchByTrainLineId(trainLineIds: List<String>): List<AreaDao>

    fun insertArea(area: AreaDao)

    fun updateArea(area: AreaDao)
}