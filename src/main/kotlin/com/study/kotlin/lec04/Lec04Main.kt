package com.study.kotlin.lec04

import com.study.lec04.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money1;
    val money4 = JavaMoney(2_000)

    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.");
    }

    println(money1 == money3)
    println(money1 == money4)
    println(money1 === money3)
    println(money1 === money4)

    if (fun1() || fun2()) {
        println("본문 1")
    }

    if (fun1() && fun2()) {
        println("본문 2")
    }

    val money11 = Money(1_000L)
    val money22 = Money(2_000L)
    println(money11 + money22)

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}