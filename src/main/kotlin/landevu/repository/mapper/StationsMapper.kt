package landevu.repository.mapper

import landevu.repository.dao.StationDao
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface StationsMapper {
    @Select("select * from stations where station_id = #{stationId}")
    fun findById(trainLineId: String): StationDao

    @Select("select * from stations where train_line_id = #{trainLineId}")
    fun findByTrainLineId(trainLineId: String): List<StationDao>

    @Select("select * from stations where area_id = #{areaId}")
    fun searchByAreaId(areaId: String): List<StationDao>

    @Select("select * from stations where station_name like concat('%', #{stationName}, '%')")
    fun searchByName(stationName: String): List<StationDao>
}