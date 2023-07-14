package topics

fun maximumWealth(accounts: Array<IntArray>): Int {
    var maxWealthSoFar = 0

    for (customer in accounts) {
        var currentCustomerWealth = 0

        for (bank in customer) {
            currentCustomerWealth += bank
        }

        if (currentCustomerWealth > maxWealthSoFar) {
            maxWealthSoFar = currentCustomerWealth
        }
    }

    return maxWealthSoFar
}

fun main() {
    val customer = intArrayOf(1, 2, 3)
    val nextCustomer = intArrayOf(3, 2, 1)
    val accounts = arrayOf(customer, nextCustomer)

    println(maximumWealth(accounts))
}
