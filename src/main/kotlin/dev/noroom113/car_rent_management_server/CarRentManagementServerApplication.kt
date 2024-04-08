package dev.noroom113.car_rent_management_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class CarRentManagementServerApplication

fun main(args: Array<String>) {
    runApplication<CarRentManagementServerApplication>(*args)
}
