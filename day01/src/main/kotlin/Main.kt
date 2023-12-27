package org.example

fun main() {
    println(solveCalibration())
}

fun solveCalibration(): Int {
    val calibrationValues: List<String> = readLinesFromTextFile("calibrationValues.txt")
    var calibrationValueSum = 0

    calibrationValues.forEach { item ->
        val stringWithDigits = extractDigitsFromString(item)

        calibrationValueSum +=
            if (stringWithDigits.length == 1) {
                doubleOutputIfSingleDigit(stringWithDigits).toInt()
            } else {
                getFirstAndLastDigit(stringWithDigits).toInt()
            }
    }

    return calibrationValueSum
}

fun extractDigitsFromString(stringWithDigits: String): String {
    val digitMapping =
        mapOf(
            "zero" to "0",
            "one" to "1",
            "two" to "2",
            "three" to "3",
            "four" to "4",
            "five" to "5",
            "six" to "6",
            "seven" to "7",
            "eight" to "8",
            "nine" to "9",
        )

    // chunked is used to solve the following problem
    // eighttwothree -> eigh23
    // now the digit gets placed in the middle
    // eighttwothree -> eig8httw2othr3ee
    var result = stringWithDigits
    digitMapping.forEach { (word, digit) ->
        result = result.replace(word, word.chunked(1).joinToString(digit))
    }

    // To solve part one
    // replace result with stringWithDigits in the return statement
    return result.filter { it.isDigit() }
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
