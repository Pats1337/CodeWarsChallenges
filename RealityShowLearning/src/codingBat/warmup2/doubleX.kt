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
    println(doubleX("axaxbb"))
}

fun doubleX(str: String): Boolean {
    var findXX = false
    if(str.contains("xx")){
        findXX = true
    }
    return findXX
}
