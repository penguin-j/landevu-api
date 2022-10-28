package landevu.service

import landevu.dto.Area
import landevu.repository.AreaRepository
import org.springframework.stereotype.Service

@Service
class SearchAreaServiceImpl(private val areaRepository: AreaRepository) : SearchAreaService {
    override fun execute(areaId: String): Area {
        return areaRepository.findById(areaId)
    }
}