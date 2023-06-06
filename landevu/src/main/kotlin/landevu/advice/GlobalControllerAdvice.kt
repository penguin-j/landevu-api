package landevu.advice

import org.springframework.stereotype.Component
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
@Component
class GlobalControllerAdvice {
    @ExceptionHandler(Exception::class)
    fun log(e: Exception, model: Model) {
        println(e)
    }
}