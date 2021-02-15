package com.braveplayers.oauth.feignclients

import com.braveplayers.oauth.entities.User
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Component
@FeignClient(name= "game-user", path = "/users")
interface UserFeignClients {

    @GetMapping("/search")
    fun findByLogin(@RequestParam login: String): ResponseEntity<User>
}