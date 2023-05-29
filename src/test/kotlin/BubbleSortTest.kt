import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class BubbleSortTest {

    @Test
    fun `Given an unsorted array, when bubbleSort is called, then it should return a sorted array`() {
        // Arrange
        val array = intArrayOf(5, 3, 8, 1, 2)
        val expectedArray = intArrayOf(1, 2, 3, 5, 8)

        // Act
        val algorithm = BubbleSortAlgorithm()
        val sortedArray = algorithm.sort(array)

        // Assert
        assertArrayEquals(expectedArray, sortedArray)
    }

    @Test
    fun `Given an empty array, when bubbleSort is called, then it should return an empty array`() {
        // Arrange
        val array = intArrayOf()
        val expectedArray = intArrayOf()

        // Act
        val algorithm = BubbleSortAlgorithm()
        val sortedArray = algorithm.sort(array)

        // Assert
        assertArrayEquals(expectedArray, sortedArray)
    }

    @Test
    fun `Given an array with a single element, when bubbleSort is called, then it should return the same array`() {
        // Arrange
        val array = intArrayOf(1)
        val expectedArray = intArrayOf(1)

        // Act
        val algorithm = BubbleSortAlgorithm()
        val sortedArray = algorithm.sort(array)

        // Assert
        assertArrayEquals(expectedArray, sortedArray)
    }
}