import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QuickSortTest {

    @Test
    fun testQuickSort() {
        val quickSortAlgorithm = QuickSortAlgorithm()

        // Test array is unsorted initially.
        val array = intArrayOf(9, -3, 5, 2, 6, 8, -6, 1, 3)
        val sortedArray = quickSortAlgorithm.quickSort(array, 0, array.size - 1)

        // Expected sorted array.
        val expectedArray = intArrayOf(-6, -3, 1, 2, 3, 5, 6, 8, 9)

        // Check if the sorted array is as expected.
        assertArrayEquals(expectedArray, sortedArray)
    }

    @Test
    fun testQuickSortWithEmptyArray() {
        val quickSortAlgorithm = QuickSortAlgorithm()

        // Test empty array.
        val array = intArrayOf()
        val sortedArray = quickSortAlgorithm.quickSort(array, 0, array.size - 1)

        // Expected sorted array is also empty.
        val expectedArray = intArrayOf()

        // Check if the sorted array is as expected.
        assertArrayEquals(expectedArray, sortedArray)
    }
}