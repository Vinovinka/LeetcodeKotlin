package topics

fun main() {
    println(sum(5,6))

    println(testString(5))
}

fun sum(a: Int, b: Int): Int = a + b

fun testString(x: Int): String {
    return "String is $x"
}