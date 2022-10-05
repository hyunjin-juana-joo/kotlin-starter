package com.study.kotlin.lec02

import com.study.lec01.Person

fun main() {
    val str: String? = "ABC"
//    println(str.length)   // null이 들어올수도 있어서 컴파일 오류
    println(str?.length)    // null이 아니면 실행하고, null이면 실행하지 않는다 (그대로 null)

    val str2: String? = null
    println(str2?.length ?: 0)   // elvis 연산자: 앞의 연산 결과가 null이면 뒤의 값을 사용

    println(startsWithA("ABC"))
    println(startsWithA(null))

    val person = Person("공부하는 현진주", 32)
    startsWithA(person.name)

    val person2 = Person(null, 0)
    startsWithA(person2.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw java.lang.IllegalArgumentException("null이 들어옴")

//    if (str == null) {
//        throw java.lang.IllegalArgumentException("null이 들어옴")
//    }
//
//    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startsWithA(str: String?): Boolean {
    return str!!.startsWith("A")
}
