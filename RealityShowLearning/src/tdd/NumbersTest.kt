package tdd

import org.junit.Test
import kotlin.test.assertEquals

internal class NumbersTest {

    @Test
    fun test_sum() {
        val numbers: Numbers = Numbers.Base(12, 4)
        val actual = numbers.sum()
        val expected: Int = 16
        assertEquals(expected, actual)
    }
}
