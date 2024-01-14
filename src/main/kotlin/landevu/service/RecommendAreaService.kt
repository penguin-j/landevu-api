package landevu.service

import landevu.dto.RecommendAreaRequest
import landevu.dto.RecommendAreaResponseElement

interface RecommendAreaService {
    fun execute(recommendAreaRequest: RecommendAreaRequest): List<RecommendAreaResponseElement>
}