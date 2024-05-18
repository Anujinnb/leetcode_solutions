//Explanation: First, we check if the head is null or not. Then we initialize dummy node and connect it to the head. We also have prev node
//that points to the dummy and current node that points to the head. If current node's value equals to the value, then prev node's next node is
//going to be current's next node. Otherwise, then we move prev node to the current. 

//Runtime complexity: O(n) where n is the number of nodes in the linked list. We traverse the nodes in the linked list only once
//Space complexity: O(1) the pointers are not dependent on the size of the linked list

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }

            current = current.next;
        }

        return dummy.next;
    }
}