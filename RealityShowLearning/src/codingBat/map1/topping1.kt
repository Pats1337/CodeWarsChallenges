package codingBat.map1

//Given a map of food keys and topping values,
// modify and return the map as follows: if the key "ice cream" is present,
// set its value to "cherry". In all cases,
// set the key "bread" to have the value "butter".

fun main() {
    println(topping1(mutableMapOf("ice cream" to "peanuts")))
    println(topping1(mutableMapOf()))
    println(topping1(mutableMapOf("pancake" to "syrup")))
}

fun topping1(myMutableMap: MutableMap<String, String>): MutableMap<String, String> {
    if(myMutableMap.containsKey("ice cream")){
        myMutableMap["ice cream"] = "cherry"
    }
    myMutableMap["bread"] = "butter"
    return myMutableMap
}
