package landevu.repository

import landevu.dto.AreaRepresentativeSpot

interface AreaRepresentativeSpotRepository {
    fun findByAreaId(areaId: String): List<AreaRepresentativeSpot>

    fun findBySpotId(spotId: String): AreaRepresentativeSpot
}