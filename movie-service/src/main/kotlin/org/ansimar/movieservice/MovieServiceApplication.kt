package org.ansimar.movieservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class MovieServiceApplication

fun main(args: Array<String>) {
	runApplication<MovieServiceApplication>(*args)
}
