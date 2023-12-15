package org.example

fun main() {
    println("Hello World!")
}

fun extractDigitsFromString(stringWithDigits: String): String {
    return stringWithDigits.filter { it.isDigit() }
}

fun getFirstAndLastDigit(stringWithDigits: String): String {
    return "${stringWithDigits.first()}${stringWithDigits.last()}"
}

fun doubleOutputIfSingleDigit(singleDigitString: String): String {
    return singleDigitString + singleDigitString
}
