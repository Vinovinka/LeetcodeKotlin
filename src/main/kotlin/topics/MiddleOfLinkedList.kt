package topics

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun middleNode(head: ListNode?): ListNode? {
    val lst = mutableListOf<ListNode?>()
    var current = head

    lst.add(head)

    while (current != null) {
        if (current.next != null) {
            current = current.next
            lst.add(current)
        } else {
            break
        }
    }

    return lst[lst.size / 2]
}

fun middleNodeWithTwoPointers(head: ListNode?): ListNode? {
    var slow: ListNode? = head
    var fast: ListNode? = head

    while (fast?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

fun main() {
    val head = ListNode(1)
    head.next = ListNode(2)
    head.next?.next = ListNode(3)
    head.next?.next?.next = ListNode(4)
    head.next?.next?.next?.next = ListNode(5)

    val middleNode = middleNodeWithTwoPointers(head)

    if (middleNode != null) {
        println("Middle Node: ${middleNode.`val`}")
    } else {
        println("The linked list is empty.")
    }
}
