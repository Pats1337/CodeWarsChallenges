package codingBat.map1

//Modify and return the given map as follows: if the key "a" has a value,
// set the key "b" to have that value, and set the key "a" to have the value "".
// Basically "b" is a bully, taking the value and replacing it with
// the empty string.

fun main() {
    println(mapBully(mutableMapOf("a" to "candy", "b" to "dirt")))
    println(mapBully(mutableMapOf("a" to "candy")))
    println(mapBully(mutableMapOf("a" to "candy", "b" to "carrot", "c" to "meh")))
}

fun mapBully(myMutableMap: MutableMap<String, String>): MutableMap<String, String> {
    if(myMutableMap.contains("a")){
        myMutableMap.put("b", myMutableMap.getValue("a"))
        myMutableMap.put("a", "")
    }
    return myMutableMap
}



