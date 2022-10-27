package landevu.controller

import landevu.const.AppConst
import landevu.dto.*
import landevu.service.RegisterAreaService
import landevu.service.SearchAreaService
import landevu.service.UpdateAreaService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class AreaController(
    private val searchAreaService: SearchAreaService,
    private val registerAreaService: RegisterAreaService,
    private val updateAreaService: UpdateAreaService
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

    @PutMapping("${URI_AREAS}/update")
    @ResponseStatus(HttpStatus.OK)
    fun updateArea(@RequestBody updateAreaRequest: UpdateAreaRequest): UpdateAreaResponse {
        val updatedAreas: List<Area> = updateAreaService.execute(updateAreaRequest.areas)
        return UpdateAreaResponse(updatedAreas)
    }
}