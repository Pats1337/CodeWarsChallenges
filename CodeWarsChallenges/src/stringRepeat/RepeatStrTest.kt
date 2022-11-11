package stringRepeat

import org.junit.Assert.*
import org.junit.Test

class RepeatStrTest {

    @Test
    fun test_repeatStr() {
        assertEquals("blablabla", repeatStr(3, "bla"))
        assertEquals("", repeatStr(5, ""))
        assertEquals("", repeatStr(0, "bla"))
        assertEquals("123", repeatStr(1, "123"))
        assertEquals("qweqweqweqweqwe", repeatStr(5, "qwe"))
    }

}