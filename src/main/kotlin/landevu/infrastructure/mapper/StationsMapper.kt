package landevu.infrastructure.mapper

import landevu.infrastructure.dao.StationDao
import org.apache.ibatis.annotations.Mapper

@Mapper
interface StationsMapper {
    fun findById(trainLineId: String): StationDao

    fun findByTrainLineId(trainLineId: String): List<StationDao>

    fun searchByAreaId(areaId: String): List<StationDao>

    fun searchByName(stationName: String): List<StationDao>
}