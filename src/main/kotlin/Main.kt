import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    println("Hello, welcome to the sort Algorithms!")
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
                println("\nYou've selected the Bubble Sort Algorithm, now you'll insert the size and the numbers of the list")
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
                println("\nYou've selected the Quick Sort Algorithm, please enter the list of numbers that you want to sort:")
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

}

fun mergeSortSelected() {

}

fun quickSortSelected() {

}

fun selectionSortSelected() {

}

fun exitSelected() {

}