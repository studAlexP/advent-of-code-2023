package org.example

fun main() {
    println("Hello World!")
}

fun isGamePossible(cubeCounts: CubeCounts): Boolean {
    val MAX_NUMBER_OF_RED_CUBES = 12
    val MAX_NUMBER_OF_GREEN_CUBES = 13
    val MAX_NUMBER_OF_BLUE_CUBES = 14
    return cubeCounts.red <= MAX_NUMBER_OF_RED_CUBES
            && cubeCounts.green <= MAX_NUMBER_OF_GREEN_CUBES
            && cubeCounts.blue <= MAX_NUMBER_OF_BLUE_CUBES
}