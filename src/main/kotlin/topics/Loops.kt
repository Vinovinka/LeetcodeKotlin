package topics

fun main() {

    // for
    val items = listOf("apple", "orange", "banana") // list.of() Java9
    //mutableListOf("apple, orange, banana") // ArrayList

    for (item in items)
        println(item)

    // while
    var index = 0

    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    // Range
    println(5 in 3..10)

    for (i in 1..10)
        println(i)

    for (i in 0 until 10)
        println(i)

    for (i in 10 downTo 0)
        println(i)

    for (i in 0..100 step 10)
        println(i)
}