package tdd

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals

internal class NumbersTest {

    @Test
    fun test_sum() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected: Int = 16
        assertEquals(expected, actual)
    }

    @Test
    fun test_difference() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.difference()
        val expected: Int = 8
        assertEquals(expected, actual)
    }

    @Test
    fun test_divide() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.divide()
        val expected = 3.0
        assertEquals(expected, actual)
    }

    @Test
    fun test_divide_double() {
        val numbers: Numbers = Numbers.Base(10, 4)
        val actual = numbers.divide()
        val expected = 2.5
        assertEquals(expected, actual)
    }


}
