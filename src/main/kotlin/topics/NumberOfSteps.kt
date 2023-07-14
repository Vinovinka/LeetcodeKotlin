package topics

fun numberOfStepsBitwise(num: Int): Int {

    var stepsCount = 0
    var number = num

    while (number > 0) {
        if ((number and 1) == 0) {
            number = number shr 1
        } else {
            number--
        }
        stepsCount++
    }

    return stepsCount
}

fun numberOfSteps(num: Int): Int {

    var stepsCount = 0
    var number = num

    while (number > 0) {
        if (number % 2 == 0) {
            number /= 2
        } else {
            number--
        }
        stepsCount++
    }

    return stepsCount
}

fun main() {
    println(numberOfSteps(14))
}