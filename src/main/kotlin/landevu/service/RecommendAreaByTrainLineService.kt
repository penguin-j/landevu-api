package landevu.service

import landevu.dto.RecommendAreaResponseElement

interface RecommendAreaByTrainLineService {
    fun execute(trainLines: List<String>): List<RecommendAreaResponseElement>
}