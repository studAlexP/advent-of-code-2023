package org.example

fun main() {
    println("Hello World!")
}

fun extractCubeCounts(roundInput: String): CubeCounts {
    val counts = roundInput.split(",")
        .fold(CubeCounts(0, 0, 0)) { acc, cube ->
            when {
                cube.contains("red") -> acc.copy(red = acc.red + extractNumber(cube))
                cube.contains("green") -> acc.copy(green = acc.green + extractNumber(cube))
                cube.contains("blue") -> acc.copy(blue = acc.blue + extractNumber(cube))
                else -> acc
            }
        }

    return counts
}

fun extractNumber(cube: String): Int {
    return cube.split(" ").firstOrNull { it.toIntOrNull() != null }?.toInt() ?: 0
}

fun isGamePossible(cubeCounts: CubeCounts): Boolean {
    val MAX_NUMBER_OF_RED_CUBES = 12
    val MAX_NUMBER_OF_GREEN_CUBES = 13
    val MAX_NUMBER_OF_BLUE_CUBES = 14

    return cubeCounts.red <= MAX_NUMBER_OF_RED_CUBES &&
        cubeCounts.green <= MAX_NUMBER_OF_GREEN_CUBES &&
        cubeCounts.blue <= MAX_NUMBER_OF_BLUE_CUBES
}
