package com.study.kotlin.lec14

fun main() {
    val person1 = PersonDto("주현진", 100)
    val person2 = PersonDto("주현진", 100)

    println(person1 == person2)
    println(person1.name)
}

data class PersonDto(
    val name: String,
    val age: Int,
)