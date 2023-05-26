private fun partition(array: IntArray, low: Int, high: Int): Int {
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
    // swap arr[i+1] and arr[high]
    val temp = array[i+1]
    array[i+1] = array[high]
    array[high] = temp

    return i+1
}

fun quickSort(array: IntArray, low: Int, high: Int): IntArray {
    if (low < high) {
        val pi = partition(array, low, high)
        quickSort(array, low, pi-1)
        quickSort(array, pi+1, high)
    }

    return array
}


