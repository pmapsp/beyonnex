import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AnagramCheckerUTest {

    @Test
    fun `test isAnagram when two strings are different length is false`(){
        val expectedResult = false
        val stringA = "lengthOf9"
        val stringB = "lengthOf10"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are different is false`() {
        val expectedResult = false
        val stringA = "aString"
        val stringB = "bString"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are anagrams is true`() {
        val expectedResult = true
        val stringA = "isanagram"
        val stringB = "marganasi"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are anagrams and one of them has an upper case character is true`() {
        val expectedResult = true
        val stringA = "isAnagram"
        val stringB = "marganasi"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are anagrams and one of them has a space character is true`() {
        val expectedResult = true
        val stringA = "is anagram"
        val stringB = "marganasi"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are anagrams and one of them has tab character is true`() {
        val expectedResult = true
        val stringA = "is   anagram"
        val stringB = "marganasi"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }

    @Test
    fun `test isAnagram when two strings are anagrams and one of them has a paragraph character is true`() {
        val expectedResult = true
        val stringA = "is\nanagram"
        val stringB = "marganasi"

        val result = stringA.isAnagram(stringB)

        assertEquals(expectedResult, result)
    }
}