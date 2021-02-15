package com.braveplayers.oauth

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class OauthApplication

fun main(args: Array<String>) {
	runApplication<OauthApplication>(*args)
}
