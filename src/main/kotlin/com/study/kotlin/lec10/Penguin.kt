package com.study.kotlin.lec10

class Penguin (
    species: String
): Animal(species, 2), Flyable, Swimable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄이 뒤뚱뒤뚱 걸어가~")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

//    override val swimAbility: Int
//        get() = 3

}