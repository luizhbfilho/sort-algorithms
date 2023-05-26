import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
class MergeSortTest {

    private val mergeSortAlgorithm = MergeSortAlgorithm()
    @Test
    fun testSortedArray() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        Assertions.assertArrayEquals(expected, mergeSortAlgorithm.mergeSort(input))
    }

    @Test
    fun testReverseSortedArray() {
        val input = intArrayOf(6, 5, 4, 3, 2, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5, 6)
        Assertions.assertArrayEquals(expected, mergeSortAlgorithm.mergeSort(input))
    }

    @Test
    fun testArrayWithNegativeIntegers() {
        val input = intArrayOf(-3, -1, -2)
        val expected = intArrayOf(-3, -2, -1)
        Assertions.assertArrayEquals(expected, mergeSortAlgorithm.mergeSort(input))
    }

    @Test
    fun testSingleElementArray() {
        val input = intArrayOf(1)
        val expected = intArrayOf(1)
        Assertions.assertArrayEquals(expected, mergeSortAlgorithm.mergeSort(input))
    }

    @Test
    fun testEmptyArray() {
        val input = intArrayOf()
        val expected = intArrayOf()
        Assertions.assertArrayEquals(expected, mergeSortAlgorithm.mergeSort(input))
    }
}