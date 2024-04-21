# Runtime complexity: O(nlogn) because sorting takes nlogn times
# Space complexity: O(1) since we didn't use extra space to store some values

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        return nums[len(nums) // 2]
