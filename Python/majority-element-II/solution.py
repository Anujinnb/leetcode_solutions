class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        hashmap = {}
        result = []

        for num in nums:
            if num not in hashmap:
                hashmap[num] = 1
            else:
                hashmap[num] = hashmap.get(num) + 1
        
        for key, value in hashmap.items():
            if value > len(nums) // 3:
                result.append(key)
        
        return result