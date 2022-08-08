package codingBat.map1

//Modify and return the given map as follows:
// for this problem the map may or may not contain the "a" and "b" keys.
// If both keys are present, append their 2 string values together and
// store the result under the key "ab".

fun main() {
    println(mapAB(mutableMapOf("a" to "Hi", "b" to "There")))
    println(mapAB(mutableMapOf("a" to "Hi")))
    println(mapAB(mutableMapOf("b" to "There")))
}

fun mapAB(myMutableMap: MutableMap<String, String>): MutableMap<String, String> {
    if (myMutableMap.containsKey("a") && myMutableMap.containsKey("b")) {
        myMutableMap.put("ab",
            myMutableMap.getValue("a") + myMutableMap.getValue("b"))
    }
    return myMutableMap
}
