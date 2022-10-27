package landevu.service

import landevu.dto.Area
import landevu.repository.mapper.AreaMapper
import org.springframework.stereotype.Service

@Service
class RegisterAreaServiceImpl(private val areaMapper: AreaMapper) : RegisterAreaService {
    override fun execute(areas: List<Area>): List<Area> {
        val registered: MutableList<Area> = mutableListOf()
        areas.forEach {
            areaMapper.insertArea(it)
            registered.add(it)
        }
        return registered
    }
}