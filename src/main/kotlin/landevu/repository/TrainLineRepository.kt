package landevu.repository

import landevu.dto.TrainLine

interface TrainLineRepository {
    fun findById(trainLineId: String): TrainLine

    fun findAll(): List<TrainLine>
}