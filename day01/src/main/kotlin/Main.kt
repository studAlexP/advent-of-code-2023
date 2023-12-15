package org.example

fun main() {
    println("Hello World!")
}

fun extractDigitsFromString(stringWithDigits: String): String {
    return stringWithDigits.filter { it.isDigit() }
}
