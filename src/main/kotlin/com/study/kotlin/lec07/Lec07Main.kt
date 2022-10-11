package com.study.kotlin.lec07

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (ex: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    return try {
        str.toInt()
    } catch (ex: NumberFormatException) {
        null
    }
}