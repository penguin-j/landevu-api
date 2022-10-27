package landevu.service

import landevu.dto.Area

interface SearchAreaService {
    fun execute(areaId: String): Area
}