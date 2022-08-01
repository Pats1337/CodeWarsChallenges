package codingBat.logic1

//The number 6 is a truly great number.
// Given two int values, a and b, return true if either one is 6.
// Or if their sum or difference is 6.

    fun main(args: Array<String>) {
        println(love6(6, 4))
        println(love6(4, 5))
        println(love6(1, 5))
        println(love6(-6, 12))
    }

    fun love6(a: Int, b: Int): Boolean {
        var haveSix = false
        if (a == 6 || b == 6) {
            haveSix = true
        } else if (Math.abs(a - b) == 6 || a + b == 6) {
            haveSix = true
        }
        return haveSix
    }