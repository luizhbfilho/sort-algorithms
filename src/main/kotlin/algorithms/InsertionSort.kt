fun insertionSort(array: IntArray): IntArray {
    for (i in 1 until array.size) {
        val key = array[i]
        var j = i -1

        while (j >= 0 && array[j] > key) {
            array[ j + 1] = array[j]
            j -= 1
        }

        array[j + 1] = key
    }

    return array
}