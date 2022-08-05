package codingBat.array1

//Given 2 arrays of ints, a and b, return true if they have the same first element
// or they have the same last element. Both arrays will be length 1 or more.

fun main() {
    println(commonEnd(arrayOf(1,2,3), arrayOf(7,3)))
    println(commonEnd(arrayOf(1,2,3,4), arrayOf(7,3)))
    println(commonEnd(arrayOf(1), arrayOf(1)))
    println(commonEnd(arrayOf(3), arrayOf(7,3)))
}

fun commonEnd(firstArray: Array<Int>, secondArray: Array<Int>): Boolean {
    return (firstArray[0] == secondArray[0] ||
            firstArray[firstArray.lastIndex] == secondArray[secondArray.lastIndex])
}
