package landevu.repository.mapper

import landevu.repository.dao.SpotDao
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface SpotMapper {
    @Select("select * from spot where spot_id = #{spotId}")
    fun findById(spotId: String): SpotDao

    @Select("select * from spot")
    fun findAll(): List<SpotDao>
}