# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        list = []
        current = head

        while current is not None:
            list.append(current.val)
            current = current.next

        left = 0
        right = len(list) - 1

        while left < right:
            if list[left] != list[right]:
                return False
            
            left += 1
            right -= 1

        return True