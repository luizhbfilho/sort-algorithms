import algorithms.SortAlgorithm

class SelectionSortAlgorithm: SortAlgorithm {

    override fun sort(array: IntArray): IntArray {
        // The outer loop iterates over each element from start to the second-to-last element.
        for (i in 0 until array.size - 1) {
            var minIndex = i
            // The inner loop looks for the smallest element in the remaining unsorted part of the array.
            for (j in i + 1 until array.size) {
                // If a smaller element is found, update minIndex to the new index.
                if (array[j] < array[minIndex])
                    minIndex = j
            }

            // After finding the smallest element in the unsorted part, swap it with the element at the current position.
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }

        return array
    }
}