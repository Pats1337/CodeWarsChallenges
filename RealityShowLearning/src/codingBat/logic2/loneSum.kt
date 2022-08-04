package codingBat.logic2

//Given 3 int values, a b c, return their sum. However,
// if one of the values is the same as another of the values,
// it does not count towards the sum.

fun main() {
    println(loneSum(1, 2, 3))
    println(loneSum(3, 2, 3))
    println(loneSum(3, 3, 3))
}

fun loneSum(a: Int, b: Int, c: Int): Int {
    return if (a == b && b == c) {
        0
    } else if (a == b) {
        c
    } else if (b == c) {
        a
    } else if (a == c) {
        b
    } else {
        a + b + c
    }
}
