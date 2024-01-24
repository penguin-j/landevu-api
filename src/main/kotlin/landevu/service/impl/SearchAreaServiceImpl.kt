package landevu.service.impl

import landevu.dto.Area
import landevu.repository.AreaRepository
import landevu.service.SearchAreaService
import org.springframework.stereotype.Service

@Service
class SearchAreaServiceImpl(private val areaRepository: AreaRepository) : SearchAreaService {
    override fun execute(areaId: String): Area {
        return areaRepository.findById(areaId)
    }
}