package com.youngkim.portfolio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PortfolioApplication


//Kotlin 에서 process 의 시작점
fun main(args: Array<String>) {
	runApplication<PortfolioApplication>(*args)
}
