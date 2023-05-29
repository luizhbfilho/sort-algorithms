import utils.arrayInput
import utils.executeAlgorithm
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
                executeAlgorithm(BubbleSortAlgorithm())
            }

            2 -> {
                println("\nYou've selected the Heap Sort Algorithm, please enter the list of numbers that you want to sort:")
                executeAlgorithm(HeapSortAlgorithm())
            }

            3 -> {
                println("\nYou've selected the Insertion Sort Algorithm, please enter the list of numbers that you want to sort:")
                executeAlgorithm(InsertionSortAlgorithm())
            }

            4 -> {
                println("\nYou've selected the Merge Sort Algorithm, please enter the list of numbers that you want to sort:")
                executeAlgorithm(MergeSortAlgorithm())
            }

            5 -> {
                println("\nYou've selected the Quick Sort Algorithm")
                val numbers = arrayInput()
                val algorithm = QuickSortAlgorithm()
                val result = algorithm.quickSort(numbers, 0, numbers.size - 1)
                printArray(result)
            }

            6 -> {
                println("\nYou've selected the Selection Sort Algorithm, please enter the list of numbers that you want to sort:")
                executeAlgorithm(SelectionSortAlgorithm())
            }
        }
    } else {
        println("\nPlease enter a number between 0 and 6, run the program again!")
    }
}