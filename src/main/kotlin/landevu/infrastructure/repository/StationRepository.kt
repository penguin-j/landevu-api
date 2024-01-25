package landevu.infrastructure.repository

import landevu.dto.Station

interface StationRepository {
    fun findById(stationId: String): Station

    fun findByTrainLineId(trainLineId: String): List<Station>

    fun searchByAreaId(areaId: String): List<Station>

    fun searchByName(stationName: String): List<Station>
}