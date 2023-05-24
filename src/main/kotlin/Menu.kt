import utils.printArray

fun menu() {
    println("Hello, welcome to the Kotlin sort algorithms!")
    println("Please look at the code of the selected algorithm to better understand it")
    println("Select the algorithm that you want to test below: ")
    println(
        "1 - Bubble Sort\n" +
                "2 - Heap Sort\n" +
                "3 - Insertion Sort\n" +
                "4 - Merge Sort\n" +
                "5 - Quick Sort\n" +
                "6 - Selection Sort\n" +
                "0 - Exit"
    )
    print("Your option: ")
    val optionSelected = readLine()?.toIntOrNull()

    if (optionSelected in 0..6) {
        when (optionSelected) {
            0 -> {
                println("\nThanks! See you next time :)")
            }

            1 -> {
                println("\nYou've selected the Bubble Sort Algorithm")
                bubbleSortSelected()

            }

            2 -> {
                println("\nYou've selected the Heap Sort Algorithm, please enter the list of numbers that you want to sort:")
                heapSortSelected()
            }

            3 -> {
                println("\nYou've selected the Insertion Sort Algorithm, please enter the list of numbers that you want to sort:")
                insertionSortSelected()
            }

            4 -> {
                println("\nYou've selected the Merge Sort Algorithm, please enter the list of numbers that you want to sort:")
                mergeSortSelected()
            }

            5 -> {
                println("\nYou've selected the Quick Sort Algorithm")
                quickSortSelected()
            }

            6 -> {
                println("\nYou've selected the Selection Sort Algorithm, please enter the list of numbers that you want to sort:")
                selectionSortSelected()
            }
        }
    } else {
        println("\nPlease enter a number between 0 and 6, run the program again!")
    }
}

fun bubbleSortSelected() {
    print("Enter the size of the list: ")
    val size = readLine()?.toIntOrNull() ?: 0

    val numbers = IntArray(size)

    for (i in numbers.indices) {
        print("Enter number at index $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers[i] = number
    }

    bubbleSort(numbers)
}

fun heapSortSelected() {

}

fun insertionSortSelected() {
    print("Enter the size of the list: ")
    val size = readLine()?.toIntOrNull() ?: 0

    val numbers = IntArray(size)

    for (i in numbers.indices) {
        print("Enter number at index $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers[i] = number
    }

    insertionSort(numbers)
}

fun mergeSortSelected() {
    print("Enter the size of the list: ")
    val size = readLine()?.toIntOrNull() ?: 0

    val numbers = IntArray(size)

    for (i in numbers.indices) {
        print("Enter number at index $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers[i] = number
    }

    mergeSort(numbers)
    printArray(numbers)
}

fun quickSortSelected() {
    print("Please enter the list of numbers that you want to sort separated by spaces: ")

    val input = readLine()!!
    val array = input.split(" ").map { it.toInt() }.toIntArray()

    quickSort(array, 0, array.size-1)

    println("\nSorted array: ${array.joinToString(" ")}")
}

fun selectionSortSelected() {
    print("Enter the size of the list: ")
    val size = readLine()?.toIntOrNull() ?: 0

    val numbers = IntArray(size)

    for (i in numbers.indices) {
        print("Enter number at index $i: ")
        val number = readLine()?.toIntOrNull() ?: 0
        numbers[i] = number
    }

    selectionSort(numbers)
}