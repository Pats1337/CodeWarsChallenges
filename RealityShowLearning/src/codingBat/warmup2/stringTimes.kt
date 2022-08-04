package codingBat.logic1

//Given a string and a non-negative int n,
// return a larger string that is n copies of the original string.

fun main(args: Array<String>){
    println(stringTimes("Hi", 2))
    println(stringTimes("Hi", 3))
    println(stringTimes("Hi", 1))
}

fun stringTimes(str: String, i: Int): String {
    var newStr = ""
    for(x in 1..i){
        newStr += str
    }
    return newStr
}
