package landevu.service

import landevu.dto.RecommendAreaResponseElement

interface SearchAreaByTrainLineService {
    fun execute(trainLines: List<String>): List<RecommendAreaResponseElement>
}