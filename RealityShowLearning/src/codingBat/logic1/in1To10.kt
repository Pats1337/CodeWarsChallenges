package codingBat.logic1

//Given a number n, return true if n is in the range 1..10, inclusive.
// Unless outsideMode is true, in which case return true
// if the number is less or equal to 1, or greater or equal to 10.

fun main(args: Array<String>) {
    println(in1To10(5, false))
    println(in1To10(11, false))
    println(in1To10(11, true))
}

fun in1To10(n: Int, outsideMode: Boolean): Boolean {
    var x = false
    if (outsideMode) {
        if (n >= 10 || n <= 1) {
            x = true
        }
    } else {
        if (n in 1..10) {
            x = true
        }
    }
    return x
}
