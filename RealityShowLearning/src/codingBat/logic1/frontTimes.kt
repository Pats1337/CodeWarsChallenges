package codingBat.logic1

//Given a string and a non-negative int n,
// we'll say that the front of the string is the first 3 chars,
// or whatever is there if the string is less than length 3.
// Return n copies of the front;

fun main(args: Array<String>) {
    println(frontTimes("Chocolate", 2))
    println(frontTimes("Chocolate", 3))
    println(frontTimes("Chocolate", 1))
    println(frontTimes("Chocolate", 0))
    println(frontTimes("ab", 2))
    println(frontTimes("C", 5))
}

fun frontTimes(str: String, i: Int): String {
    var newStr = ""
    var frontLen = 3
    if (frontLen > str.length) {
        frontLen = str.length
    }
    val front = str.substring(0, frontLen)
    for (x in 1..i) {
        newStr += front
    }
    return newStr
}

