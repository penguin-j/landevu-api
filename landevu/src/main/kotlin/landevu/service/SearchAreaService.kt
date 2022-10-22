package landevu.service

import landevu.repository.dao.Area

interface SearchAreaService {
    fun execute(areaId: String): Area
}