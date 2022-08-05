package codingBat.array1

//Given an array of ints length 3, return the sum of all the elements.

fun main() {
    println(sum3(arrayOf(1, 2, 3)))
    println(sum3(arrayOf(1)))
    println(sum3(arrayOf(2, 3)))
    println(sum3(arrayOf(1000, 2, 3000, 10000)))
    println(sum3(arrayOf()))
}

fun sum3(ints: Array<Int>): Int {
    var sum = 0
    for (i in ints.indices) {
        sum += ints[i]
    }
    return sum
}
