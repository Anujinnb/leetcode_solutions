//Explanation for the code: Unless current node and next node are null, we need to check whether the value of 
//the current node and the value of the next node are equal. If the condition is true, then we need to remove that node.
//Otherwise, we can continue with the process until we go through the whole list.

//Runtime complexity: O(n)
//Space complexity: O(1)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}