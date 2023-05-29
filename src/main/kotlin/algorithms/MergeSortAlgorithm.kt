import algorithms.SortAlgorithm

class MergeSortAlgorithm: SortAlgorithm {
    override fun sort(array: IntArray): IntArray {
        // Base case: if the array has only one element, return it.
        if (array.size <= 1) {
            return array
        }

        // Split the array into two halves.
        val mid = array.size / 2
        val left = array.copyOfRange(0, mid)
        val right = array.copyOfRange(mid, array.size)

        // Recursively sort the two halves.
        val sortedLeft = sort(left)
        val sortedRight = sort(right)

        // Merge the two sorted halves.
        return merge(sortedLeft, sortedRight)
    }

    private fun merge(left: IntArray, right: IntArray): IntArray {
        // Create a new array to store the merged results.
        val merged = IntArray(left.size + right.size)

        // Indexes into the left and right arrays.
        var i = 0
        var j = 0

        // Iterate over the merged array.
        for (k in 0 until merged.size) {
            // If the left array is exhausted, add all remaining elements from the right array.
            if (i == left.size) {
                merged[k] = right[j++]
            }
            // If the right array is exhausted, add all remaining elements from the left array.
            else if (j == right.size) {
                merged[k] = left[i++]
            }
            // Otherwise, add the smaller of the two elements from the left and right arrays.
            else if (left[i] < right[j]) {
                merged[k] = left[i++]
            } else {
                merged[k] = right[j++]
            }
        }

        // Return the merged array.
        return merged
    }
}
