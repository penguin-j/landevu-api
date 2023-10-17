package landevu

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LandevuApplication

fun main(args: Array<String>) {
	runApplication<LandevuApplication>(*args)
}
