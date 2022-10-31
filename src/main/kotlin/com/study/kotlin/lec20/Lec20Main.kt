package com.study.kotlin.lec20

fun main() {

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val numbers =  mutableListOf("one", "two", "three")
    println("The list elements before adding new one: $numbers")
    numbers.add("four")
}
