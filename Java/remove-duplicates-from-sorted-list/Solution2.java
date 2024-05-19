//Runtime complexity: O(n) we traverse through the linked list only once
//Space complexity: O(1) pointers don't require extra space

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