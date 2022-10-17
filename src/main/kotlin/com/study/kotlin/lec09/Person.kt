package com.study.kotlin.lec09

import com.study.lec09.JavaPerson

fun main() {
    val person = JavaPerson("주현진", 32)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("주현진")
    val person3 = Person()
}

class Person (  // 주생성자 (반드시 존재)
//    name: String,
    val name: String = "주현진",
    val age: Int = 1
) {

//    var name = name
//    set(value) {    // setter 지양
//        field = value.uppercase()
//    }

//    val name: String = name
//    get() = field.uppercase()

//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

//    val uppercaseName: String
//        get() = this.name.uppercase()

    init {
        if (age < 0) {
            throw java.lang.IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }

        println("초기화")
    }

    constructor(name: String): this(name, 1)    // 부생성자(optional) 여러개 선언 가능, 부생성자보다는 default parameter 사용 권장

    constructor(): this("주현진") {    // 부생성자(optional)
        println("부생성자2")
    }

    val isAdult: Boolean
        get() = this.age >= 20

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }
//
//    val isAdult: Boolean
//    get() {
//        return this.age >= 20
//    }
}