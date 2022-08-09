package codingBat.string2

//Given a string, return a string where for every char in the original,
// there are two chars.

fun main() {
    println(doubleChar("The"))
}

fun doubleChar(str: String): String {
    var newStr = ""
    for(i in str){
        newStr += i.toString() + i.toString()
    }
    return newStr
}
