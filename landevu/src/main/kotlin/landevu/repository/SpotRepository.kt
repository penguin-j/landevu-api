package landevu.repository

import landevu.dto.Spot

interface SpotRepository {
    fun findById(spotId: String): Spot

    fun findAll(): List<Spot>
}