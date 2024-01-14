package landevu.service

import landevu.dto.Area
import landevu.dto.RecommendAreaResponseElement
import landevu.repository.AreaRepository
import landevu.repository.SpotRepository
import org.springframework.stereotype.Service

@Service
class SearchAreaByTrainLineServiceImpl(
    private val areaRepository: AreaRepository, private val spotRepository: SpotRepository
) : SearchAreaByTrainLineService {
    override fun execute(trainLines: List<String>): List<RecommendAreaResponseElement> {
        val areas = areaRepository.searchByTrainLineId(trainLines)
        val recommendAreaResponseElements = areas.map {
            RecommendAreaResponseElement(it, spotRepository.findByAreaId(it.areaId))
        }
        return recommendAreaResponseElements
    }
}