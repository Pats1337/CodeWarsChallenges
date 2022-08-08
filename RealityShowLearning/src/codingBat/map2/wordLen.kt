package codingBat.map2

//Given an array of strings, return a Map<String, Integer> containing a key
// for every different string in the array,
// and the value is that string's length.

fun main() {
    println(wordLen(arrayOf("a", "bb", "a", "bb")))
    println(wordLen(arrayOf("a", "bb", "ccc", "dddd")))
}

fun wordLen(arrayOf: Array<String>): MutableMap<String, Int> {
    val myMutableMap = mutableMapOf<String, Int>()
    for (i in arrayOf) {
        myMutableMap[i] = i.length
    }
    return myMutableMap
}