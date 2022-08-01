package codingBat.logic1

import kotlin.math.abs

//We'll say a number is special if it is a multiple of 11
// or if it is one more than a multiple of 11.
// Return true if the given non-negative number is special.
// Use the % "mod" operator

fun main(args: Array<String>) {
    println(specialEleven(22))
    println(specialEleven(23))
    println(specialEleven(24))
}

fun specialEleven(n: Int): Boolean {
    return n % 11 == 0 || abs(n % 11) == 1
}
