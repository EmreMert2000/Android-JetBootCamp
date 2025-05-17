package com.example.androidbootcampbasicsyntax.oop.inheritance

fun main() {
    val admin = Admin("Emre Mert", "123456")
    println(admin.getPermissions())

    val user = User("John Doe")
    println(user.getPermissions())

    println(admin.name)
    println(user.name)
}