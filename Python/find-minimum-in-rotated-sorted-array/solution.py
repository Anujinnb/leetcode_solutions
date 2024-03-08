class Solution:
    def findMin(self, nums: List[int]) -> int:
        low = 0
        high = len(nums) - 1
        min_val = nums[0]

        while low <= high:
            mid = (low + high) // 2

            if nums[high] < nums[mid]:
                low = mid + 1
            else:
                high = mid - 1
                min_val = min(min_val, nums[mid])

        return min_val
