package com.example.androidbootcampbasicsyntax.oop.polymorphism


fun main() {
    val message = Message("Emre", "Hi", false)
    val messageTwo = Message("John Doe", "Welcome", true)

    message.getMessageInfo()
    messageTwo.getMessageInfo()
}