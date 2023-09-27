class Solution(object):
    def longestConsecutive(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        count = 1
        result = 1

        if not nums:
            return 0

        hashset = set(nums)
        sorted_nums = sorted(hashset)

        for i in range(len(sorted_nums) - 1):
            if sorted_nums[i + 1] - sorted_nums[i] == 1:
                count += 1
            else:
                count = 1

            result = max(result, count)

        return result
