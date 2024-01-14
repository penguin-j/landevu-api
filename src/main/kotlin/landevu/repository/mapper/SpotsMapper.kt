package landevu.repository.mapper

import landevu.repository.dao.SpotDao
import org.apache.ibatis.annotations.Mapper

@Mapper
interface SpotsMapper {
    fun findById(spotId: String): SpotDao

    fun findAll(): List<SpotDao>

    fun findByAreaId(areaId: String): List<SpotDao>
}