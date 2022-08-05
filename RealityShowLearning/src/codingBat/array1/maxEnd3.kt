package codingBat.array1

//Given an array of ints length 3, figure out which is larger, the first or last element in the array,
// and set all the other elements to be that value. Return the changed array.

fun main() {
    println(maxEnd3(arrayListOf(1, 2, 3, 4, 5)).contentToString())
    println(maxEnd3(arrayListOf(3)).contentToString())
    println(maxEnd3(arrayListOf(5,-5)).contentToString())
    println(maxEnd3(arrayListOf(1, 2, 3)).contentToString())
}

fun maxEnd3(ints: ArrayList<Int>): Array<Int> {
    var maxVal = ints[0]
    for (i in ints.indices) {
        if (maxVal < ints[i]) {
            maxVal = ints[i]
        }
    }
    return Array(ints.size) { maxVal }
}
