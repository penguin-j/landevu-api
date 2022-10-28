package landevu.repository

import landevu.dto.Area

interface AreaRepository {
    fun findById(areaId: String): Area

    fun insertArea(area: Area)

    fun updateArea(area: Area)
}