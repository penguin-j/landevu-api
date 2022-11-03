package landevu.dto

data class Spot(
    val spotId: String = "spot000001",
    val spotName: String = "JR東京駅",
    val areaId: String = "area130001",
    val coordinate: Coordinate = Coordinate(139.76608399999998, 35.681382)
)