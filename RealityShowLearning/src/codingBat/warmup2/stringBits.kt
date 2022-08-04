package codingBat.warmup2

//Given a string, return a new string made of every other char
// starting with the first, so "Hello" yields "Hlo".

fun main() {
    println(stringBits("Hello"))
    println(stringBits("Hheelllloo"))
    println(stringBits("H"))
    println(stringBits("He"))
    println(stringBits("Hel"))
    println(stringBits(""))
}

fun stringBits(str: String): String {
    var newStr = ""
    for (i in str.indices step 2){
        newStr +=str.substring(i,i+1)
    }
    return newStr
}
