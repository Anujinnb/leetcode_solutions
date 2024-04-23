class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        nums_sum = sum(nums)
        left_sum = 0
        
        for i in range(len(nums)):
            left = 0 if i == 0 else nums[i - 1]

            left_sum += left
            right_sum = nums_sum - nums[i] - left_sum

            if left_sum == right_sum:
                return i

        return -1 
            