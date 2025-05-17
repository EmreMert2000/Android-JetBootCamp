package com.example.androidbootcampbasicsyntax.oop.polymorphism

import com.example.kotlinmodernprogramming.oop.polymorphism.Animal
import com.example.kotlinmodernprogramming.oop.polymorphism.Dog

fun main() {
    val animal = Animal()
    println(animal.speak())

    val dog = Dog()
    println(dog.speak())


}