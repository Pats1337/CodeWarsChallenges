package codingBat.map2

//Given an array of non-empty strings,
// create and return a Map<String, String> as follows:
// for each string add its first character as a key with
// its last character as the value.

fun main() {
    println(pairs(arrayOf("code", "bug")))
    println(pairs(arrayOf("man", "moon", "main")))
}

fun pairs(strings: Array<String>): MutableMap<String, String> {
    val myMutableMap = mutableMapOf<String, String>()
    for (i in strings) {
        myMutableMap[i.substring(0, 1)] = i.last().toString()
    }
    return myMutableMap
}
