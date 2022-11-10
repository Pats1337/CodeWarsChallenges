package removeFirstAndLastCharacter

import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {

    @Test
    fun test_removeChar() {
        assertEquals("loquen", removeChar("eloquent"))
        assertEquals("ountr", removeChar("country"))
        assertEquals("erso", removeChar("person"))
        assertEquals("lac", removeChar("place"))
        assertEquals("oopss", removeChar("ooopsss"))
    }
}