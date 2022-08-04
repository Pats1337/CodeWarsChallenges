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
    println(doubleX("aggggbx"))
}

fun doubleX(str: String): Boolean {
    var findXX = false
    val i = str.indexOf("x")
    if (i != -1 &&
        i + 1 < str.length &&
        str.substring(i, i + 2).equals("xx")
    ) {
        findXX = true
    }
    return findXX
}
