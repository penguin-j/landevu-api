package landevu.service

import landevu.dto.RecommendAreaByDeparturePlacesRequest
import landevu.dto.RecommendAreaResponseElement

interface RecommendAreaByDeparturePlacesService {
    fun execute(recommendAreaByDeparturePlacesRequest: RecommendAreaByDeparturePlacesRequest): List<RecommendAreaResponseElement>
}