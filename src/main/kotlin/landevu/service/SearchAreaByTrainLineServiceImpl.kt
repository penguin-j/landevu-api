package landevu.service

import landevu.dto.Area
import landevu.repository.AreaRepository
import org.springframework.stereotype.Service

@Service
class SearchAreaByTrainLineServiceImpl(private val areaRepository: AreaRepository) : SearchAreaByTrainLineService {
    override fun execute(trainLines: List<String>): List<Area> {
        return areaRepository.searchByTrainLineId(trainLines)
    }
}