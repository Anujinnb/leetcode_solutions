class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hashmap = {}
        stack = []
        result2 = [-1] * len(nums2)

        for i in range(len(nums2) - 1, -1, -1):
            while stack and stack[-1] <= nums2[i]:
                stack.pop()
            
            if stack and stack[-1] > nums2[i]:
                result2[i] = stack[-1]
            
            stack.append(nums2[i])
            hashmap[nums2[i]] = result2[i]
        
        result1 = []

        for num in nums1:
            result1.append(hashmap.get(num))
        
        return result1
