package landevu.controller

import landevu.const.AppConst
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthcheckController {

    companion object {
        const val URI_HEALTHCHECK = "${AppConst.URI_HOME}/healthcheck"
    }

    @GetMapping(URI_HEALTHCHECK)
    @ResponseStatus(HttpStatus.OK)
    fun execute() {
    }
}