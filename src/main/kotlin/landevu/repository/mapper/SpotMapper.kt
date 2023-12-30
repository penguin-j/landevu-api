package landevu.repository.mapper

import landevu.repository.dao.SpotDao
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface SpotMapper {
    @Select("select * from spots where spot_id = #{spotId}")
    fun findById(spotId: String): SpotDao

    @Select("select * from spots")
    fun findAll(): List<SpotDao>
}