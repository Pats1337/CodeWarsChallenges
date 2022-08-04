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
    val sum: Int
    if (a == b && b == c){
        sum = 0
    } else if (a == b){
        sum = c
    } else if (b == c){
        sum = a
    } else if (a == c){
        sum = b
    } else {
        sum = a + b + c
    }
    return sum
}
