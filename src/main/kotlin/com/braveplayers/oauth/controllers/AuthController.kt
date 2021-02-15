package com.braveplayers.oauth.controllers

import com.braveplayers.oauth.entities.User
import com.braveplayers.oauth.services.UserService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/auth")
class AuthController(val service: UserService) {

    @GetMapping("/search")
    fun findByLogin(@RequestParam login: String): ResponseEntity<User> {
        val entity = service.findByLogin(login)

        return if (entity != null) {
            ResponseEntity<User>(entity, HttpStatus.OK)
        } else {
            ResponseEntity<User>(entity, HttpStatus.NOT_FOUND)
        }
    }
}
