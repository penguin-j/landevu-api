package landevu.config
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class CorsConfiguration : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**") // すべてのエンドポイントにCORSを適用
            .allowedOrigins("*") // 許可するオリジンを指定、必要に応じて適切なオリジンに変更
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 許可するHTTPメソッドを指定
            .allowedHeaders("*") // 許可するリクエストヘッダーを指定、必要に応じて適切に指定
    }
}
