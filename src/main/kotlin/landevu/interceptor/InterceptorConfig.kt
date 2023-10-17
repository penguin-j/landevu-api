package landevu.interceptor

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class InterceptorConfig : WebMvcConfigurer {
    @Bean
    fun landevuInterceptor(): ControllerLogInterceptor {
        return ControllerLogInterceptor()
    }

    @Override
    override fun addInterceptors(registry: InterceptorRegistry) {
        registry.addInterceptor(landevuInterceptor())
    }
}