package landevu.repository.mapper

import landevu.repository.dao.AreaDao
import org.apache.ibatis.annotations.Mapper

@Mapper
interface AreaMapper {
    fun findById(areaId: String): AreaDao

    fun searchByTrainLineId(trainLineIds: List<String>): List<AreaDao>

    fun insertArea(area: AreaDao)

    fun updateArea(area: AreaDao)
}