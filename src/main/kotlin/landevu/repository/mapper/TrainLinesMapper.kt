package landevu.repository.mapper

import landevu.repository.dao.TrainLineDao
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface TrainLinesMapper {
    @Select("select * from train_lines where train_line_id = #{trainLineId}")
    fun findById(trainLineId: String): TrainLineDao

    @Select("select * from train_lines")
    fun findAll(): List<TrainLineDao>
}