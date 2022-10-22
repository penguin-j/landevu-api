package landevu.repository.mapper

import landevu.repository.dao.Area
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface AreaMapper {
    @Select("select * from area where area_id = #{areaId}")
    fun findById(areaId: String): Area
}