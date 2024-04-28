class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        numsSet1, numsSet2 = set(nums1), set(nums2)
        result1, result2 = set(), set()

        for num in nums1:
            if num not in numsSet2:
                result1.add(num)
        
        for num in nums2:
            if num not in numsSet1:
                result2.add(num)

        return [result1, result2]