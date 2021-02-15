package com.braveplayers.oauth.services

import com.braveplayers.oauth.entities.User
import com.braveplayers.oauth.feignclients.UserFeignClients
import org.springframework.stereotype.Component

@Component
class UserService(val userFeignClients: UserFeignClients) {

    fun findByLogin(login: String): User? {
        val user = userFeignClients.findByLogin(login).body

        return user
    }
}