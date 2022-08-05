package codingBat.array1

//Given an array of ints length 3, return a new array with the elements in reverse order,
// so {1, 2, 3} becomes {3, 2, 1}.

fun main() {
    println(reverse3(arrayListOf(1,2,3,4,5)))
    println(reverse3(arrayListOf(1)))
    println(reverse3(arrayListOf(3,2,1)))
    println(reverse3(arrayListOf()))
}

fun reverse3(ints: ArrayList<Int>): ArrayList<Int> {
    ints.reverse()
    return ints
}
