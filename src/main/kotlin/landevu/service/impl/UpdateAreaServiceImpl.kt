package landevu.service.impl

import landevu.dto.Area
import landevu.repository.AreaRepository
import landevu.service.UpdateAreaService
import org.springframework.stereotype.Service

@Service
class UpdateAreaServiceImpl(private val areaRepository: AreaRepository) : UpdateAreaService {
    override fun execute(areas: List<Area>): List<Area> {
        val updated: MutableList<Area> = mutableListOf()
        areas.forEach {
            areaRepository.updateArea(it)
            updated.add(it)
        }
        return updated
    }
}