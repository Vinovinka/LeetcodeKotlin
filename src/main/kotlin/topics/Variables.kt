package topics

fun main() {
    val hello: String = "Hello"
    var world = "World"
    val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

    world = "Mars"

    println("$hello, $world!")
    println("Month is ${month[5]}")
}