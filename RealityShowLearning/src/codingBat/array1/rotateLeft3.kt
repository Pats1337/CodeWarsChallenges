package codingBat.array1

import java.util.*
import kotlin.collections.ArrayList

//Given an array of ints length 3, return an array with the elements
// "rotated left" so {1, 2, 3} yields {2, 3, 1}.

fun main() {
    println(rotateLeft3(arrayListOf(1, 2, 3)))
    println(rotateLeft3(arrayListOf(1)))
    println(rotateLeft3(arrayListOf()))
    println(rotateLeft3(arrayListOf(2, 4, 6, 8, 10, 12, 14, 16, 18, 20)))
}

fun rotateLeft3(ints: ArrayList<Int>): ArrayList<Int> {
    Collections.rotate(ints, 1)
    return ints
}
