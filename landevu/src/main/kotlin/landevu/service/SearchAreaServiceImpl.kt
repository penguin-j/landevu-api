package landevu.service

import landevu.repository.dao.Area
import landevu.repository.mapper.AreaMapper
import org.springframework.stereotype.Service

@Service
class SearchAreaServiceImpl(private val areaMapper: AreaMapper): SearchAreaService {
    override fun execute(areaId: String): Area {
        return areaMapper.findById(areaId)
    }
}