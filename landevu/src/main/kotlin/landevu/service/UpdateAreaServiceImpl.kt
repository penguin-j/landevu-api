package landevu.service

import landevu.dto.Area
import landevu.repository.mapper.AreaMapper
import org.springframework.stereotype.Service

@Service
class UpdateAreaServiceImpl(private val areaMapper: AreaMapper) : UpdateAreaService {
    override fun execute(areas: List<Area>): List<Area> {
        val updated: MutableList<Area> = mutableListOf()
        areas.forEach {
            areaMapper.updateArea(it)
            updated.add(it)
        }
        return updated
    }
}