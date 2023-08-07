package topics

fun findMaxConsecutiveOnes(nums: IntArray): Int {
    var maxCount = 0
    var currentCount = 0

    for (num in nums) {
        if (num == 1) {
            currentCount++
            maxCount = maxOf(maxCount, currentCount)
        } else {
            currentCount = 0
        }
    }

    return maxCount
}

fun findMaxConsecutiveOnesWithFold(nums: IntArray): Int {
    val result = nums.fold(0 to 0) { (maxCount, currentCount), num ->
        if (num == 1) {
            currentCount + 1 to maxOf(maxCount, currentCount + 1)
        } else {
            0 to maxCount
        }
    }

    return result.second
}

fun main() {
    val nums = intArrayOf(1, 1, 0, 1, 1, 1, 0, 1, 1, 1)
    val maxConsecutiveOnes = findMaxConsecutiveOnes(nums)
    val maxConsecutiveOnesWithFold = findMaxConsecutiveOnesWithFold(nums)
    println("Maximum consecutive ones: $maxConsecutiveOnes")
}