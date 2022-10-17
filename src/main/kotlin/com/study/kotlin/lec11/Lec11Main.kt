package com.study.kotlin.lec11

// 접근제어자: public, protected, internal, private
class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
        private set
}

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}