package codingBat.logic2

//We want to make a row of bricks that is goal inches long.
// We have a number of small bricks (1 inch each) and big bricks (5 inches each).
// Return true if it is possible to make the goal by choosing from the given bricks.
// This is a little harder than it looks and can be done without any loops.

fun main() {
    println(makeBricks(3,1,8))
    println(makeBricks(1000000, 1000, 1000100))
    println(makeBricks(2, 1000000, 100003))
    println(makeBricks(40, 2, 52))
}

fun makeBricks(small: Int, big: Int, goal: Int): Boolean {
    var canMake = true
    if(goal > big * 5 + small || goal % 5 > small){
        canMake = false
    }
    return canMake
}
