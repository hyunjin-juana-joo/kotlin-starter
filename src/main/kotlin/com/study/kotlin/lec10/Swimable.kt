package com.study.kotlin.lec10

interface Swimable {

//    val swimAbility: Int

    val swimAbility: Int
        get() = 3

    fun act() {
        println("어푸어푸")
    }
}