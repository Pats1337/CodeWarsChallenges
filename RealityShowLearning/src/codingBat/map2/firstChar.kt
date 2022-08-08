package codingBat.map2

//Given an array of non-empty strings, return a Map<String, String>
// with a key for every different first character seen,
// with the value of all the strings starting with that character appended
// together in the order they appear in the array.

fun main() {
    println(firstChar(arrayOf("salt", "tea", "soda", "toast")))
    println(firstChar(arrayOf("aa", "bb", "cc", "aAA", "cCC", "d")))
}

fun firstChar(strings: Array<String>): MutableMap<String, String> {
    val myMutableMap = mutableMapOf<String, String>()
    for (i in strings) {
        if (!myMutableMap.containsKey(i.first().toString())) {
            myMutableMap[i.first().toString()] = i
        } else {
            val lastText = myMutableMap.getValue(i.first().toString())
            myMutableMap[i.first().toString()] = lastText + i
        }
    }
    return myMutableMap
}
