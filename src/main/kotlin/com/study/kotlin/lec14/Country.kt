package com.study.kotlin.lec14

fun handCountry(country: Country) {
    when(country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US"),
}