package landevu.controller

import landevu.const.AppConst
import landevu.repository.dao.Area
import landevu.service.SearchAreaServiceImpl
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchAreaController(private val searchAreaService: SearchAreaServiceImpl) {
    companion object {
        const val URI_AREAS = "${AppConst.URI_HOME}/areas"
    }

    @GetMapping("${URI_AREAS}/search/{areaId}")
    fun searchArea(@PathVariable("areaId") areaId: String): Area {
        return searchAreaService.execute(areaId)
    }
}