package com.example.androidbootcampbasicsyntax.General

fun main() {
    val email = EmailNotification("emre@example.com")
    val sms = SmsNotification("555-1234")

    email.send()
    sms.send()

    email.log()
    sms.log()
}