package landevu.repository

import landevu.dto.TrainLine
import landevu.repository.dao.TrainLineDao
import landevu.repository.mapper.TrainLinesMapper
import org.springframework.stereotype.Repository

@Repository
class TrainLineRepositoryImpl(private val trainLinesMapper: TrainLinesMapper) : TrainLineRepository {
    override fun findById(trainLineId: String): TrainLine {
        val record: TrainLineDao = trainLinesMapper.findById(trainLineId)
        return TrainLine(record.trainLineId, record.trainLineName)
    }

    override fun findAll(): List<TrainLine> {
        val records: List<TrainLineDao> = trainLinesMapper.findAll()
        return records.map { TrainLine(it.trainLineId, it.trainLineName) }
    }
}