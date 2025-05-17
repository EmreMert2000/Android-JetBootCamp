package com.example.androidbootcampbasicsyntax.oop.inheritance

open class User(val name: String) {

    open fun getPermissions(): String {
        return "Read-only access"
    }
}