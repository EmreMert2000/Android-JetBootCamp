package com.example.androidbootcampbasicsyntax.oop.polymorphism

//Message
//Emre: Merhaba Nasılsın? - Okunmadı

class Message(
    val sender: String,
    val content: String,
    val isRead: Boolean
) {
    fun getMessageInfo() {
        println("From: $sender - Message: $content - Read: $isRead")
    }
}