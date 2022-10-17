package com.study.kotlin.lec12

import com.study.lec12.Movable

fun main() {
    moveSomething(object: Movable {
        override fun move() {
            println("움직인당3")
        }

        override fun fly() {
            println("난당3")
        }
    })

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

private fun moveSomething(movalbe: Movable) {
    movalbe.move()
    movalbe.fly()
}

object Singleton {
    var a: Int = 0
}