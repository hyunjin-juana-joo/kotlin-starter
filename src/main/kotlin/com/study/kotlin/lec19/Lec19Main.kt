package com.study.kotlin.lec19

// as import
import com.study.lec17.Fruit
import com.study.kotlin.lec19.a.printHelloWorld as printHelloWorldA
import com.study.kotlin.lec19.b.printHelloWorld as printHelloWorldB

data class Person(
    val name: String,
    val age: Int
)
//{
//    operator fun component1(): String {
//        return this.name
//    }
//
//    operator fun component2(): Int {
//        return this.age
//    }
//}

fun main() {

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }

    val numbers = listOf(1, 2, 3)
    numbers.map { it + 1 }
        .forEach { println(it) }

    for (number in numbers) {
        if( number == 2) {
            break
        }
    }

    run {
        numbers.forEach {number ->
            if (number == 2) {
                return@run
            }
        }
    }

    val person = Person("주아나", 32)
    // 구조분해 문법
    // val name = person.component1()
    // val age = person.component2()
    val (name, age) = person

    println("이름 : ${name}, 나이 : ${age}")

    printHelloWorldA()
    printHelloWorldB()
}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}