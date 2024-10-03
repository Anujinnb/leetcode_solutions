class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        current = head
        
        while current is not None:
            while stack and stack[-1].val < current.val:
                stack.pop()
            
            stack.append(current)
            current = current.next
        
        newHead = None

        while stack:
            current = stack.pop()
            current.next = newHead
            newHead = current
        
        return current