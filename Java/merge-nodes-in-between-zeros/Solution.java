class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode current = head.next;

        while (current != null) {
            if (current.next.val != 0) {
                current.val += current.next.val;
                current.next = current.next.next;
            } else {
                current.next = current.next.next;
                current = current.next;
            }
        }

        return head.next;
    }
}