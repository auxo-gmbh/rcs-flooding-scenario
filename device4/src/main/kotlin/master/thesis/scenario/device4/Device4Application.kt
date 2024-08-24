package master.thesis.scenario.device4

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
class Device4Application

fun main(args: Array<String>) {
    runApplication<Device4Application>(*args)
}
