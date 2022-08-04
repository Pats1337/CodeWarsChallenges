package codingBat.logic1

//Count the number of "xx" in the given string.
// We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

fun main(args: Array<String>) {
    println(countXX("xxx"))
    println(countXX("adcxx"))
    println(countXX("xx"))
    println(countXX("adb"))
    println(countXX("x"))
    println(countXX("xxxx"))
    println(countXX("Hexxo thxxe"))
    println(countXX(""))
}

fun countXX(str: String): Int {
    var count = 0
    for (i in 0..str.length-2) {
        if(str.substring(i, i+2).equals("xx")){
            count++
        }
    }
    return count
}
