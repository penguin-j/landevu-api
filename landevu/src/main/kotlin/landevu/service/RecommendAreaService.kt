package landevu.service

import landevu.dto.Area
import landevu.dto.RecommendAreaRequest

interface RecommendAreaService {
    fun execute(recommendAreaRequest: RecommendAreaRequest): List<Area>
}