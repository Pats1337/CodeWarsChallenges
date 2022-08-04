package codingBat.logic2

//For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more,
// so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5,
// so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
// To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
// Write the helper entirely below and at the same indent level as roundSum().

fun main() {
    println(roundSum(1, 2, 3))
    println(roundSum(5, 6, 3))
    println(roundSum(5, 5, 5))
    println(roundSum(15, 12, 13))
    println(roundSum(25, 35, 13))
    println(roundSum(105, 102, 103))
    println(roundSum(100, 98, 103))

}

fun roundSum(a: Int, b: Int, c: Int): Int {
    return roundingInt(a) + roundingInt(b) + roundingInt(c)
}

fun roundingInt(num: Int): Int {
    val roundedNum: Int
    if (num % 10 >= 5) {
        roundedNum = (num / 10) * 10 + 10
    } else {
        roundedNum = (num / 10) * 10
    }
    return roundedNum
}

