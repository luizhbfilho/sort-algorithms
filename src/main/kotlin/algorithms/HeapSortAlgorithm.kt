import algorithms.SortAlgorithm

class HeapSortAlgorithm: SortAlgorithm {
    override fun sort(array: IntArray): IntArray {
        // Build a max heap from the array
        buildMaxHeap(array)

        /* Iterate over the array from the end, swapping the root element with the last element and then heapifying the array
           without the last element
        */
        for (i in array.size - 1 downTo 1) {
            val temp = array[0]
            array[0] = array[i]
            array[i] = temp
            heapify(array, 0, i - 1)
        }

        return array
    }

    private fun buildMaxHeap(array: IntArray) {
        // Start at the last non-leaf node
        for (i in (array.size / 2) - 1 downTo 0) {
            heapify(array, i)
        }
    }

    private fun heapify(array: IntArray, rootIndex: Int, heapSize: Int = array.size - 1) {
        // Get the left and right child indices of the root node
        val leftChildIndex = (2 * rootIndex) + 1
        val rightChildIndex = (2 * rootIndex) + 2

        // Find the largest child of the root node
        var largestChildIndex = rootIndex
        if (leftChildIndex <= heapSize && array[leftChildIndex] > array[largestChildIndex]) {
            largestChildIndex = leftChildIndex
        }
        if (rightChildIndex <= heapSize && array[rightChildIndex] > array[largestChildIndex]) {
            largestChildIndex = rightChildIndex
        }

        // If the largest child is not the root node, swap the two nodes and heapify the subtree rooted at the largest child
        if (largestChildIndex != rootIndex) {
            val temp = array[rootIndex]
            array[rootIndex] = array[largestChildIndex]
            array[largestChildIndex] = temp
            heapify(array, largestChildIndex, heapSize)
        }
    }
}