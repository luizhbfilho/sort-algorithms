import kotlin.test.Test
import kotlin.test.assertEquals

class BubbleSortTest {

    @Test
    fun testBubbleSort() {
        val array = intArrayOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        val actual = bubbleSort(array)

        assertEquals(expected, actual)
    }
}