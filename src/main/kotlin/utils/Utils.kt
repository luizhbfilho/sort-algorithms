package utils

import algorithms.SortAlgorithm

fun printArray(arr: IntArray) {
    print("The sorted list is: ")
    for (item in arr) {
        print("$item ")
    }
    println()
}

fun arrayInput(): IntArray {
    print("Enter the size of the list: ")
    val size = readLine()?.toIntOrNull() ?: 0

    val numbers = IntArray(size)

    for (i in numbers.indices) {
        print("Enter number at index $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers[i] = number
    }

    return numbers
}

fun executeAlgorithm(algorithm: SortAlgorithm) {
    val numbers = arrayInput()
    val result = algorithm.sort(numbers)
    printArray(result)
}