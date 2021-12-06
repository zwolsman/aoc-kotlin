package year2019.day16

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("year2019/day16/test")
    check(part1(testInput) == 1) { "result = ${part1(testInput)}" }
    check(part2(testInput) == 1) { "result = ${part2(testInput)}" }

    val input = readInput("year2019/day16/input")
    println(part1(input))
    println(part2(input))
}
