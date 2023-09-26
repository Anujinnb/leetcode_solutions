class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dict = {}

        for i, num in enumerate(nums):
            difference = target - nums[i]
            if difference in dict:
                return [i, dict[difference]]
            else:
                dict[num] = i

        return []
