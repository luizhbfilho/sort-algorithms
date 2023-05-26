import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class HeapSortTest {
    @Test
    fun `heap sort test`() {
        val array = intArrayOf(5, 3, 2, 1, 4)
        val sortedArray = heapSort(array)
        assertArrayEquals(intArrayOf(1, 2, 3, 4, 5), sortedArray)
    }

    @Test
    fun `heap sort with negative numbers test`() {
        val array = intArrayOf(-5, -1, -6, 0, -4)
        val sortedArray = heapSort(array)
        assertArrayEquals(intArrayOf(-6, -5, -4, -1, 0), sortedArray)
    }

    @Test
    fun `heap sort with all equal elements test`() {
        val array = intArrayOf(3, 3, 3, 3, 3)
        val sortedArray = heapSort(array)
        assertArrayEquals(intArrayOf(3, 3, 3, 3, 3), sortedArray)
    }

    @Test
    fun `heap sort with empty array test`() {
        val array = intArrayOf()
        val sortedArray = heapSort(array)
        assertArrayEquals(intArrayOf(), sortedArray)
    }
}