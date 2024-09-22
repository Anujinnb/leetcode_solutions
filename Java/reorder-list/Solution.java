class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        
        ListNode mid = middle(head);
        ListNode secondHalf = reverseList(mid.next);
        mid.next = null;

        merge(head, secondHalf);
    }

    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public void merge(ListNode list1, ListNode list2) {
        ListNode temp1;
        ListNode temp2;

        while (list2 != null) {
            temp1 = list1.next;
            temp2 = list2.next;

            list1.next = list2;
            list2.next = temp1;

            list1 = temp1;
            list2 = temp2;
        }
    }
}
