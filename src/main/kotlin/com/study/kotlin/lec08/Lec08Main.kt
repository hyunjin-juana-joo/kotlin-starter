package com.study.kotlin.lec08

fun main() {
//    repeat("Hello World", 3, true)
    repeat("Hello World")
    repeat("Hello World", useNewLine = false)

    printNameAndGender("FEMALE", "주현진")
    printNameAndGender(gender = "FEMALE", name = "주아나")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun max(a: Int, b: Int): Int = if (a > b) a else b