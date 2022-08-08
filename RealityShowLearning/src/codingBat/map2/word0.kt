package codingBat.map2

//Given an array of strings, return a Map<String, Integer> containing a key
// for every different string in the array, always with the value 0.
// For example the string "hello" makes the pair "hello":0.
// We'll do more complicated counting later,
// but for this problem the value is simply 0.

fun main() {
    println(word0(arrayOf("a","b","a","b")))
}

fun word0(arrayOf: Array<String>): MutableMap<String, Int> {
    val myMutableMap = mutableMapOf<String, Int>()
    for(i in arrayOf){
            myMutableMap[i] = 0
    }
    return myMutableMap
}
