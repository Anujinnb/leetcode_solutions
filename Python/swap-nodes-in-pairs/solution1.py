# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None:
            return None
        
        dummy = ListNode(0)
        dummy.next = head

        prev = dummy
        first = head

        while first and first.next:
            second = first.next

            prev.next = second
            first.next = second.next
            second.next = first

            prev = first
            first = first.next
        
        return dummy.next