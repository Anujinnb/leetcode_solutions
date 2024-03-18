class Solution:

    def findMin_bruteforce(self, nums: List[int]) -> int:
        min_value = sys.maxsize
        
        for num in nums:
            if num < min_value:
                min_value = num
        
        return min_value

    def findMin_binarysearch(self, nums: List[int]) -> int:
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
