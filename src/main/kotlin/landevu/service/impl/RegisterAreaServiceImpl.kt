package landevu.service.impl

import landevu.dto.Area
import landevu.infrastructure.repository.AreaRepository
import landevu.service.RegisterAreaService
import org.springframework.stereotype.Service

@Service
class RegisterAreaServiceImpl(private val areaRepository: AreaRepository) : RegisterAreaService {
    override fun execute(areas: List<Area>): List<Area> {
        val registered: MutableList<Area> = mutableListOf()
        areas.forEach {
            areaRepository.insertArea(it)
            registered.add(it)
        }
        return registered
    }
}