package codingBat.map2

//Loop over the given array of strings to build a result string like this:
// when a string appears the 2nd, 4th, 6th, etc. time in the array,
// append the string to the result.
// Return the empty string if no string appears a 2nd time.

fun main() {
    println(wordAppend(arrayOf("a", "b", "a")))
    println(wordAppend(arrayOf("xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx")))
}

fun wordAppend(strings: Array<String>): String {
    var result = ""
    val myMutableMap = mutableMapOf<String, Int>()
    for (i in strings) {
        if (!myMutableMap.containsKey(i)) {
            myMutableMap[i] = 1
        } else {
            val count = myMutableMap.getValue(i)
            myMutableMap[i] = count + 1
            if (myMutableMap[i] != 1 && (myMutableMap[i] ?: 0) % 2 == 0) {
                result += i
            }
        }
    }
    return result
}
