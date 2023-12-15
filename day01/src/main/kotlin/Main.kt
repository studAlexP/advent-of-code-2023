package org.example

fun main() {
    val calibrationValues: List<String> = readLinesFromTextFile("calibrationValues.txt")

    var calibrationValueSum = 0

    for (item in calibrationValues) {
        val stringWithDigits = extractDigitsFromString(item)

        if (stringWithDigits.length == 1) {
            calibrationValueSum += doubleOutputIfSingleDigit(stringWithDigits).toInt()
        } else {
            calibrationValueSum += getFirstAndLastDigit(stringWithDigits).toInt()
        }
    }

    println(calibrationValueSum)
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

fun readLinesFromTextFile(fileName: String): List<String> {
    val linesFromFile = mutableListOf<String>()

    try {
        val readFile = object {}.javaClass.classLoader?.getResourceAsStream(fileName)
        readFile?.bufferedReader()?.useLines { linesFromFile.addAll(it.toList()) }
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return linesFromFile
}
