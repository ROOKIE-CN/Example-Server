package cc.example.rookie

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class RookieApplication{

	fun main(args: Array<String>) {
		runApplication<RookieApplication>(*args)
	}
}

