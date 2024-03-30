class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        new_array = [0] * (len(nums) * 2)

        for i in range(len(nums)):
            new_array[i] = nums[i]
            new_array[i + len(nums)] = nums[i]
        
        return new_array