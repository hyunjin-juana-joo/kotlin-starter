package com.study.kotlin.lec15

fun main() {


    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    mutableSetOf(100L)

    val numbers = listOf(100, 200)

    // 하나를 가져오기
    println(numbers[0])

    // For Each
    for (number in numbers) {
        println(number)
    }

    // 전통적인 For문
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val emptyList = emptyList<Int>()
    printNumbers(emptyList())

    val array = arrayOf(100, 200)

    for((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

}

private fun printNumbers(number: List<Int>) {

    println(number)

}

