package tdd

import java.lang.IllegalArgumentException

interface Numbers {

    fun sum(): Int
    fun difference(): Int
    fun divide(): Double

    class Base(
        private val number1: Int,
        private val number2: Int,
    ) : Numbers {

        override fun sum(): Int {
            return number1 + number2
        }

        override fun difference(): Int {
            return number1 - number2
        }

        override fun divide(): Double {
            return number1.toDouble() / number2
        }
    }
}