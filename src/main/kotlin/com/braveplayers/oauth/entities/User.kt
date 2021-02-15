package com.braveplayers.oauth.entities

data class User(
    val id: Long,
    val login: String,
    val password: String,
) {

    var roles: Set<Role> = mutableSetOf()
}