package landevu.service

import landevu.dto.Area

interface RegisterAreaService {
    fun execute(areas: List<Area>): List<Area>
}