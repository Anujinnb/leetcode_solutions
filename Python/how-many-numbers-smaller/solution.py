class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        result = []
        
        for i in nums:
            count = 0
            for j in nums:
                if j != i and j < i:
                    count += 1
            
            result.append(count)

        return result
