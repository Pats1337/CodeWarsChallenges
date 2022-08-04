package codingBat.warmup2

//Given a non-empty string like "Code" return a string like "CCoCodCode".

fun main() {
    println(stringSplosion("Code"))
    println(stringSplosion("abc"))
    println(stringSplosion("ab"))
}

fun stringSplosion(str: String): String {
    var newStr = ""
    for (i in str.indices) {
        newStr += str.substring(0, i + 1)
    }
    return newStr
}
