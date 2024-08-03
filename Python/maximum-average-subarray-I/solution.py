class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        sum = 0
        average = float('-inf')
        left = 0

        for right in range(len(nums)):
            sum += nums[right]

            if right - left + 1 == k:
                average = max(average, sum)
                sum -= nums[left]
                left += 1

        return average / k        