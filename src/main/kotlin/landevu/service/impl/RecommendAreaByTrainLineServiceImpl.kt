package landevu.service.impl

import landevu.dto.RecommendAreaResponseElement
import landevu.infrastructure.repository.AreaRepository
import landevu.infrastructure.repository.SpotRepository
import landevu.service.RecommendAreaByTrainLineService
import org.springframework.stereotype.Service

@Service
class RecommendAreaByTrainLineServiceImpl(
    private val areaRepository: AreaRepository, private val spotRepository: SpotRepository
) : RecommendAreaByTrainLineService {
    override fun execute(trainLines: List<String>): List<RecommendAreaResponseElement> {
        val areas = areaRepository.searchByTrainLineId(trainLines)
        val recommendAreaResponseElements = areas.map {
            RecommendAreaResponseElement(it, spotRepository.findByAreaId(it.areaId))
        }
        return recommendAreaResponseElements
    }
}