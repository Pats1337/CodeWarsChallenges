package codingBat.logic2

//Given 3 int values, a b c, return their sum.
// However, if one of the values is 13 then it does not count
// towards the sum and values to its right do not count.
// So for example, if b is 13, then both b and c do not count.

fun main() {
    println(luckySum(1, 2, 3))
    println(luckySum(1, 2, 13))
    println(luckySum(1, 13, 3))
    println(luckySum(13, 2, 3))
}

fun luckySum(a: Int, b: Int, c: Int): Int {
    return when {
        a == 13 -> {
            0
        }
        b == 13 -> {
            a
        }
        c == 13 -> {
            a + b
        }
        else -> {
            a + b + c
        }
    }
}
