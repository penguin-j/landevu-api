package landevu.repository.mapper

import landevu.dto.Area
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update

@Mapper
interface AreaMapper {
    @Select("select * from area where area_id = #{areaId}")
    fun findById(areaId: String): Area

    @Insert("insert into area values (#{areaId}, #{areaName})")
    fun insertArea(area: Area)

    @Update("update area set area_name = #{areaName} where area_id = #{areaId}")
    fun updateArea(area: Area)
}