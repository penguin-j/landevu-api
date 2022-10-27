package landevu.controller

import landevu.const.AppConst
import landevu.dto.Area
import landevu.dto.RegisterAreaRequest
import landevu.dto.RegisterAreaResponse
import landevu.service.RegisterAreaService
import landevu.service.SearchAreaService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class AreaController(
    private val searchAreaService: SearchAreaService,
    private val registerAreaService: RegisterAreaService
) {
    companion object {
        const val URI_AREAS = "${AppConst.URI_HOME}/areas"
    }

    @GetMapping("${URI_AREAS}/search/{areaId}")
    @ResponseStatus(HttpStatus.OK)
    fun searchArea(@PathVariable("areaId") areaId: String): Area {
        return searchAreaService.execute(areaId)
    }

    @PostMapping("${URI_AREAS}/register")
    @ResponseStatus(HttpStatus.CREATED)
    fun registerArea(@RequestBody registerAreaRequest: RegisterAreaRequest): RegisterAreaResponse {
        val registeredAreas: List<Area> = registerAreaService.execute(registerAreaRequest.areas)
        return RegisterAreaResponse(registeredAreas)
    }
}