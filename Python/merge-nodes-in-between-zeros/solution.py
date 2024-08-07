class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head.next

        while current is not None:
            if current.next.val != 0:
                current.val += current.next.val
                current.next = current.next.next
            else:
                current.next = current.next.next
                current = current.next
        
        return head.next