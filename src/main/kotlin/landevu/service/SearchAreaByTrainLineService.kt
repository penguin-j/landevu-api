package landevu.service

import landevu.dto.Area

interface SearchAreaByTrainLineService {
    fun execute(trainLines: List<String>): List<Area>
}