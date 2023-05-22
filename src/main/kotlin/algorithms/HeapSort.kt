fun heapify(array: IntArray, size: Int, index: Int) {
    var largest = index
    val left = 2 * index + 1
    val right = 2 * index + 2

    if (left < size && array[left] > array[largest])
        largest = left
    if (right < size && array[right] > array[largest])
        largest = right
    if (largest != index) {
        val swap = array[index]
        array[index] = array[largest]
        array[largest] = swap
        heapify(array, size, largest)
    }
}

fun heapSort(array: IntArray) {
    val size = array.size
    for (i in size / 2 - 1 downTo 0)
        heapify(array, size, i)
    for (i in size - 1 downTo 0) {
        val temp = array[0]
        array[0] = array[i]
        array[i] = temp
        heapify(array, i, 0)
    }
}