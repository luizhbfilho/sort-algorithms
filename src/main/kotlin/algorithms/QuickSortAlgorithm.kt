import algorithms.SortAlgorithm

class QuickSortAlgorithm {

    fun quickSort(array: IntArray, low: Int, high: Int): IntArray {
        // Check whether the provided range is valid.
        if (low < high) {
            val pi = partition(array, low, high)

            // Then, recursively sort the two sub-arrays around the pivot:
            // one from `low` to `pi-1` (all elements less than the pivot)
            // and one from `pi+1` to `high` (all elements greater than the pivot).
            quickSort(array, low, pi-1)
            quickSort(array, pi+1, high)
        }

        return array
    }

    // Helper function to partition the array into two parts based on the pivot element.
    private fun partition(array: IntArray, low: Int, high: Int): Int {
        // Choose the pivot element. Here, the pivot is the last element in the provided range.
        val pivot = array[high]
        var i = low - 1
        for (j in low until high) {
            if (array[j] < pivot) {
                i++
                // swap arr[i] and arr[j]
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
        // After all elements have been processed, place the pivot in its correct position
        // (right after the last element that's less than the pivot) by swapping it with
        // the element currently at index i+1.
        val temp = array[i+1]
        array[i+1] = array[high]
        array[high] = temp

        return i+1
    }
}



