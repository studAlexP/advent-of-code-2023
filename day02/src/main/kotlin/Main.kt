package org.example

import java.io.File

fun main() {
    val inputFile = File("day02/src/main/resources/gameInput.txt")

    val games = readGames(inputFile)

    val (sumOfPossibleGames, sumOfProducts) = processGames(games)

    println("Exercise 1 - Sum of possible game IDs: $sumOfPossibleGames")
    println("Exercise 2 - Sum of products: $sumOfProducts")
}

fun processGames(games: List<String>): Pair<Int, Int> {
    var sumOfPossibleGames = 0
    var sumOfProducts = 0
    for ((index, game) in games.withIndex()) {
        val rounds = game.split(";").filter { it.isNotBlank() }
        val (roundPossible, gameCounts) = processRounds(rounds)

        if (roundPossible) {
            sumOfPossibleGames += index + 1 // Adding the index (game number) of the possible game
        }

        sumOfProducts += calculateSumOfProducts(gameCounts)
    }

    return Pair(sumOfPossibleGames, sumOfProducts)
}

fun processRounds(gameRounds: List<String>): Pair<Boolean, CubeCounts> {
    var roundPossible = true
    var gameCounts = CubeCounts(0, 0, 0)
    for (round in gameRounds) {
        val cubeCounts = extractCubeCounts(round)
        gameCounts =
            CubeCounts(
                maxOf(gameCounts.red, cubeCounts.red),
                maxOf(gameCounts.green, cubeCounts.green),
                maxOf(gameCounts.blue, cubeCounts.blue),
            )
        if (!isGamePossible(cubeCounts)) {
            roundPossible = false
        }
    }

    return Pair(roundPossible, gameCounts)
}

fun calculateSumOfProducts(gameCounts: CubeCounts): Int {
    return gameCounts.red * gameCounts.green * gameCounts.blue
}

fun readGames(fileWithGames: File): List<String> {
    return fileWithGames.readText().split("Game ").filter { it.isNotBlank() }
}

fun extractCubeCounts(roundInput: String): CubeCounts {
    val counts =
        roundInput.split(",")
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
