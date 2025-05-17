package com.example.androidbootcampbasicsyntax.General

interface Drivable {
    fun drive()
}

class Bus : Drivable {
    override fun drive() {
        println("Bus is driving")
    }

}

class Car : Drivable {
    override fun drive() {
        println("Car is driving")
    }
}

class Bike : Drivable {
    override fun drive() {
        println("Bike is pedaling")
    }
}



