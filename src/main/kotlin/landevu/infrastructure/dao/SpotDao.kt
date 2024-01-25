package landevu.infrastructure.dao

data class SpotDao(
    val spotId: String,
    val spotName: String,
    val areaId: String,
    val longitude: Double,
    val latitude: Double
)