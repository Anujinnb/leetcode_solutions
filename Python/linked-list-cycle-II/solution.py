class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head

        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next

            if slow == fast:
                break
        
        if fast is None or fast.next is None:
            return None
        
        while head != slow:
            head = head.next
            slow = slow.next
        
        return head