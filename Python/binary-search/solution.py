from typing import List

class Solution:
    def bruteforce_search(self, nums: List[int], target: int) -> int:
        left = 0
        for i in range(len(nums)):
            if nums[i] == target:
                return i
        
        return -1

    def binary_search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = (left + right) // 2

            if target < nums[mid]:
                right = mid - 1
            elif target > nums[mid]:
                left = mid + 1
            else:
                return mid
        
        return -1