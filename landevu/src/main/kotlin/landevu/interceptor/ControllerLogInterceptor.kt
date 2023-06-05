package landevu.interceptor

import org.springframework.web.servlet.HandlerInterceptor
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

class ControllerLogInterceptor : HandlerInterceptor {
    @Override
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        println("START controller: ${handler}")
        return super.preHandle(request, response, handler)
    }

    @Override
    override fun afterCompletion(
        request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?
    ) {
        println("FINISH controller: ${handler}")
        super.afterCompletion(request, response, handler, ex)
    }
}