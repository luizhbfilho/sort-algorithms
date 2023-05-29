import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SelectionSortTest {

    private val selectionSortAlgorithm = SelectionSortAlgorithm()

    @Test
    fun `sort should return sorted array for normal case`() {
        val input = intArrayOf(4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4)

        val result = selectionSortAlgorithm.sort(input)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `sort should return same array for single-element array`() {
        val input = intArrayOf(1)
        val expected = intArrayOf(1)

        val result = selectionSortAlgorithm.sort(input)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `sort should return empty array for empty array`() {
        val input = intArrayOf()
        val expected = intArrayOf()

        val result = selectionSortAlgorithm.sort(input)

        assertArrayEquals(expected, result)
    }

    @Test
    fun `sort should return sorted array for array with duplicate elements`() {
        val input = intArrayOf(5, 3, 2, 5, 1)
        val expected = intArrayOf(1, 2, 3, 5, 5)

        val result = selectionSortAlgorithm.sort(input)

        assertArrayEquals(expected, result)
    }
}