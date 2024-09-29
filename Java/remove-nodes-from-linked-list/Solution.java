class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        while (current != null) {
            while (!stack.isEmpty() && stack.peek().val < current.val) {
                stack.pop();
            }

            stack.push(current);
            current = current.next;
        }

        ListNode newHead = null;
        while (!stack.isEmpty()) {
            current = stack.pop();
            current.next = newHead;
            newHead = current;
        }

        return current;
    }
}