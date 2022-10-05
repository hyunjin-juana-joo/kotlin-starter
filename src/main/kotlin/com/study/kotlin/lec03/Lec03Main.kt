package com.study.kotlin.lec03

import com.study.lec01.Person

fun main() {
    val number1 = 3
    val number2: Long = number1?.toLong() ?: 0

    printAgeIfPerson(null)

    val person = Person("현진주", 32)
    println("이름: ${person.name}")

    val name = "현진주"
    val str = """
        ABC
        DEF
        GHI
        ${name}
    """.trimIndent()

    println(str)
    println(str[0])
    println(str[1])
}

fun printAgeIfPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}