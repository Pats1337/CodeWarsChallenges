//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/kotlin

package stringRepeat

fun repeatStr(r: Int, str: String): String {
    var newStr = ""
    for (i in 0 until r)
        newStr += str
    return newStr
}