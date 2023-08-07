package topics

/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
 */

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    val result = runningSum(nums)
    println(result.joinToString(", "))
}

//fun runningSum(nums: IntArray): IntArray {
//
//    val result = IntArray(nums.size)
//    result[0] = nums[0]
//
//    for (index in 1 until nums.size) {
//        result[index] = nums[index] + result[index - 1]
//    }
//
//    return result
//}

fun runningSum(nums: IntArray): IntArray {
    for (index in 1 until nums.size) {
        nums[index] += nums[index - 1]
    }

    return nums
}