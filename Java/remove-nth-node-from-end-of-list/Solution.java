class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        for (int i = 0; i < n; i++) {
            current = current.next;
        }

        while (current != null) {
            prev = prev.next;
            current = current.next;
        }

        prev.next = prev.next.next;

        return dummy.next;
    }
}