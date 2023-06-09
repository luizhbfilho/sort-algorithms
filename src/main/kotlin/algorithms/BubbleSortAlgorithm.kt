import algorithms.SortAlgorithm

class BubbleSortAlgorithm: SortAlgorithm {

    override fun sort(array: IntArray): IntArray {
        val n = array.size

        if (n <= 1) {
            return array
        }

        for (i in 0 until n - 1) {
            for (j in 0 until n - i - 1) {
                if (array[j] > array[j + 1]) {
                    val temp = array[j]
                    array[j] = array[j + 1]
                    array[j + 1] = temp
                }
            }
        }
        return array
    }
}

