//Using the same method from Linked List cycle, if fast and next value of the fast are not null, then we move slow by one step and fast by two steps.
//Then, we return slow node. Because when fast is at the end of the linked list, then slow is at the middle node.

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}