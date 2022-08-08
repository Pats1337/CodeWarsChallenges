package codingBat.map2

//Given an array of strings, return a Map<String, Boolean>
// where each different string is a key and its value is true
// if that string appears 2 or more times in the array.

fun main() {
    println(wordMultiple(arrayOf("a", "b", "a", "c", "b")))
}

fun wordMultiple(strings: Array<String>): MutableMap<String, Boolean> {
    val myMutableMap = mutableMapOf<String, Boolean>()
    for (i in strings) {
        myMutableMap[i] = myMutableMap.containsKey(i)
    }
    return myMutableMap
}
