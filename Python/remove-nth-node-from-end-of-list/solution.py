class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        slow = dummy
        fast = head

        for i in range(n):
            fast = fast.next
        
        while fast is not:
            slow = slow.next
            fast = fast.next

        slow.next = slow.next.next

        return dummy.next
