package codingBat.map2

//The classic word-count algorithm: given an array of strings,
// return a Map<String, Integer> with a key for each different string,
// with the value the number of times that string appears in the array.

fun main() {
    println(wordCount(arrayOf("a", "b", "a", "c", "b")))
    println(wordCount(arrayOf("a", "a", "a", "a", "a")))
    println(wordCount(arrayOf("a")))
    println(wordCount(arrayOf("b", "b", "a", "c", "b")))
}

fun wordCount(strings: Array<String>): MutableMap<String, Int> {
    val myMutableMap = mutableMapOf<String, Int>()
    for (i in strings) {
        if (!myMutableMap.containsKey(i)) {
            myMutableMap[i] = 1
        } else {
            val count = myMutableMap.getValue(i)
                myMutableMap[i] = count + 1
        }
    }
    return myMutableMap
}

