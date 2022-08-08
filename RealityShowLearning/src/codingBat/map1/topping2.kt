package codingBat.map1

//Given a map of food keys and their topping values,
// modify and return the map as follows:
// if the key "ice cream" has a value,
// set that as the value for the key "yogurt" also.
// If the key "spinach" has a value, change that value to "nuts".

fun main() {
    println(topping2(mutableMapOf("ice cream" to "cherry")))
    println(topping2(mutableMapOf("yogurt" to "salt")))
    println(topping2(mutableMapOf("spinach" to "dirt", "ice cream" to "cherry")))
}

fun topping2(myMutableMap: MutableMap<String, String>): MutableMap<String, String> {
    if(myMutableMap.containsKey("ice cream")){
        myMutableMap["yogurt"] = myMutableMap.getValue("ice cream")
    }
    if(myMutableMap.containsKey("spinach")){
        myMutableMap["spinach"] = "nuts"
    }
    return myMutableMap
}
