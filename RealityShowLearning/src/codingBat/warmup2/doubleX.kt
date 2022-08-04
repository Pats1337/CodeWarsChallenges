package codingBat.warmup2


//Given a string, return true if the first instance of "x"
// in the string is immediately followed by another "x".


fun main(args: Array<String>) {
    println(doubleX("axxbb"))
    println(doubleX("a"))
    println(doubleX(""))
    println(doubleX("axxbb"))
    println(doubleX("xxbb"))
    println(doubleX("abbbbbbxxbb"))
    println(doubleX("axaxxbb"))
}

fun doubleX(str: String): Boolean {
    var findXX = false
    for (i in 0..str.length - 2) {
        if (str.substring(i, i + 1).equals("x")) {
            if (str.substring(i, i + 2).equals("xx")) {
                findXX = true
                break
            } else {
                break
            }
        }
    }
    return findXX
}
