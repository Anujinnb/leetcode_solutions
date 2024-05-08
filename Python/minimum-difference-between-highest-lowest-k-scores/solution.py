class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        if (k == 1):
            return 0
        
        left = 0
        right = k - 1
        diff = sys.maxsize

        nums.sort()

        while (right < len(nums)):
            diff = min(diff, nums[right] - nums[left])
            left += 1
            right += 1
        
        return diff