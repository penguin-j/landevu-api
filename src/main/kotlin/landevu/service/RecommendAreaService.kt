package landevu.service

import landevu.dto.Area
import landevu.dto.RecommendAreaRequest
import landevu.dto.Spot

interface RecommendAreaService {
    fun execute(recommendAreaRequest: RecommendAreaRequest): List<Pair<Area, Spot>>
}