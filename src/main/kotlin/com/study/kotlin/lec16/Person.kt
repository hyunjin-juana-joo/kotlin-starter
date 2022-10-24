package com.study.kotlin.lec16

import com.study.lec16.Person

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {
    val person = Person("현진", "주", 100)
    person.nextYearAge()
}