package codingBat.map1

//Modify and return the given map as follows:
// if the key "a" has a value, set the key "b" to have that same value.
// In all cases remove the key "c", leaving the rest of the map unchanged.

fun main() {
    println(mapShare(mutableMapOf("a" to "aaa", "b" to "bbb", "c" to "ccc")))
    println(mapShare(mutableMapOf("b" to "xyz", "c" to "ccc")))
    println(mapShare(mutableMapOf("a" to "aaa", "c" to "ccc", "d" to "ddd")))
}

fun mapShare(myMutableMap: MutableMap<String, String>): MutableMap<String, String> {
    if(myMutableMap.containsKey("a")){
        myMutableMap.put("b", myMutableMap.getValue("a"))
    }
    if(myMutableMap.containsKey("c")){
        myMutableMap.remove("c")
    }
    return myMutableMap
}
