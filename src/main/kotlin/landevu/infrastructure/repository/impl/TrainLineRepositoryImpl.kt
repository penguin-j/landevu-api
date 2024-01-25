package landevu.infrastructure.repository.impl

import landevu.dto.TrainLine
import landevu.infrastructure.dao.TrainLineDao
import landevu.infrastructure.mapper.TrainLinesMapper
import landevu.infrastructure.repository.TrainLineRepository
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