//Explanation: If the current head itself equals to the value, then we remove that value from the linked list. Then,
//using the same method from Remove Duplicates from Linked List, if the next node of the current equals to the value, then we remove that next node,
//Otherwise, we can just move the current to the next node.

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}