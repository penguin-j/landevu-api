package landevu.service

import landevu.dto.Area

interface UpdateAreaService {
    fun execute(areas: List<Area>): List<Area>
}