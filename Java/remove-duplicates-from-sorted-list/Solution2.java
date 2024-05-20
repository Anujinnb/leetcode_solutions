//Runtime complexity: O(n) we traverse through the linked list only once
//Space complexity: O(1) pointers don't require extra space

//Explanation: First, we check if current node is null or not. While current and next of the current node are not null, then we check if next node
//the value. While current node's value and next node's value are equal, then we move the next node pointer to the next.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        if (current == null) {
            return null;
        }

        while (current != null && current.next != null) {
            while (current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            }

            current = current.next;
        }

        return head;
    }
}