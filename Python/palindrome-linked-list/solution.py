class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head

        # find the middle node
        while fast is not None and fast.next is not None:
            slow = slow.next
            fast = fast.next.next
        
        prev = None
        current = slow
        next = None

        # reverse the second half of the linked list
        while current is not None:
            next = current.next
            current.next = prev
            prev = current
            current = next
        
        first_half = head
        second_half = prev

        # compare the first half and second half elements
        while first_half is not None and second_half is not None:
            if first_half.val != second_half.val:
                return False
            
            first_half = first_half.next
            second_half = second_half.next
        
        return True