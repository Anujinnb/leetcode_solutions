class Solution:
    def containsDuplicate_bruteforce(self, nums: List[int]) -> bool:
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        
        return False
    
    def containsDuplicate_sort(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                return True
        
        return False
    
    def containsDuplicate_hashset(self, nums: List[int]) -> bool:
        hashset = set()

        for num in nums:
            if num in hashset:
                return True
            
            hashset.add(num)
        
        return False

    def containsDuplicate_hashmap(self, nums: List[int]) -> bool:
        hashmap = {}

        for key, value in enumerate(nums):
            if value in hashmap:
                return True
            
            hashmap[value] = key

        return False
        