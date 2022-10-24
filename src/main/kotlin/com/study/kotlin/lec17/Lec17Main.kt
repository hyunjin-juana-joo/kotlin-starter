package com.study.kotlin.lec17

import com.study.lec17.Fruit
import java.io.BufferedReader
import java.io.FileReader

fun main() {

    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_200),
        Fruit("바나나", 3_000),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

//    val isApple: (Fruit) -> Boolean = fun (fruit: Fruit): Boolean {
//        return fruit.name == "사과"
//    }

//    val isAppleV2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

//    val isApple = fun (fruit: Fruit): Boolean {
//        return fruit.name == "사과"
//    }

//    val isAppleV2 = { fruit: Fruit -> fruit.name == "사과" }

//    isApple(fruits[0])
//    isApple.invoke(fruits[0])

//    filterFruits(fruits, isApple)
    filterFruits(fruits) { it.name == "사과" }

    var targetFruitName = "바나나"
    targetFruitName = "수박"

    filterFruits(fruits) { it.name == targetFruitName }

}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
//    val results = mutableListOf<Fruit>()
//    for (fruit in fruits) {
//        results.add(fruit)
//    }
//
//    return results;
}


