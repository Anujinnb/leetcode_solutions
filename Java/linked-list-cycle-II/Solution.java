//1. The total time complexity is O(n), where n is the number of nodes in the list, because:
// The first while loop takes O(n) time in the worst case.
// The second while loop also takes O(n) time.
// So, the total time complexity is O(n).

//2. The space complexity is O(1) because we are only using a fixed amount of extra space regardless of the size of the input list.

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        return head;
    }
}