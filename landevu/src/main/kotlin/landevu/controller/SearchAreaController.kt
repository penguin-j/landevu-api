package landevu.controller

import landevu.controller.dto.SearchAreaRequestDto
import landevu.controller.dto.SearchAreaResponseDto
import landevu.repository.dao.Area
import landevu.service.SearchAreaServiceImpl
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchAreaController(private val searchAreaService: SearchAreaServiceImpl) {
    @PostMapping("/landevu/v1/area/search")
    fun execute(@RequestBody req: SearchAreaRequestDto): SearchAreaResponseDto {
        val area: Area = searchAreaService.execute(req.areaId)
        return SearchAreaResponseDto(area)
    }
}