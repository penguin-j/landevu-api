package landevu.infrastructure.mapper

import landevu.infrastructure.dao.TrainLineDao
import org.apache.ibatis.annotations.Mapper

@Mapper
interface TrainLinesMapper {
    fun findById(trainLineId: String): TrainLineDao

    fun findAll(): List<TrainLineDao>
}