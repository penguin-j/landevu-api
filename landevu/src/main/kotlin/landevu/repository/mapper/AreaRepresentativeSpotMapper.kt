package landevu.repository.mapper

import landevu.repository.dao.AreaRepresentativeSpotDao
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface AreaRepresentativeSpotMapper {
    @Select("select * from area_representative_spot where area_id = #{areaId}")
    fun findByAreaId(areaId: String): List<AreaRepresentativeSpotDao>

    @Select("select * from area_representative_spot where spot_id = #{spotId}")
    fun findBySpotId(spotId: String): AreaRepresentativeSpotDao

    @Select("select * from area_representative_spot")
    fun findAll(): List<AreaRepresentativeSpotDao>
}