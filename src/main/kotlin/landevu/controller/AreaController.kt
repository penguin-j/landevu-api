package landevu.controller

import landevu.const.AppConst
import landevu.dto.*
import landevu.service.*
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
class AreaController(
    private val searchAreaService: SearchAreaService,
    private val searchAreaByTrainLineService: SearchAreaByTrainLineService,
    private val registerAreaService: RegisterAreaService,
    private val updateAreaService: UpdateAreaService,
    private val recommendAreaService: RecommendAreaService
) {
    companion object {
        const val URI_AREAS = "${AppConst.URI_HOME}/areas"
    }

    @GetMapping("${URI_AREAS}/search")
    @ResponseStatus(HttpStatus.OK)
    fun searchArea(@RequestParam(name = "id") areaId: String): Area {
        return searchAreaService.execute(areaId)
    }

    @PostMapping("${URI_AREAS}/recommend/by-departure-places")
    @ResponseStatus(HttpStatus.OK)
    fun recommendAreaByDeparturePlaces(@RequestBody recommendAreaRequest: RecommendAreaRequest): RecommendAreaResponse {
        val recommendedAreas: List<RecommendAreaResponseElement> = recommendAreaService.execute(recommendAreaRequest)
        return RecommendAreaResponse(recommendedAreas)
    }

    @PostMapping("${URI_AREAS}/recommend/by-train-line")
    fun recommendAreaByTrainLine(@RequestBody searchAreaByTrainLineRequest: SearchAreaByTrainLineRequest): RecommendAreaResponse {
        val areas = searchAreaByTrainLineService.execute(searchAreaByTrainLineRequest.trainLineIds)
        return RecommendAreaResponse(areas)
    }

    @PostMapping("${URI_AREAS}/register")
    @ResponseStatus(HttpStatus.OK)
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