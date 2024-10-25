class Solution:
    def findClosestElements(self, arr: List[int], k: int, x: int) -> List[int]:
        result = []

        low = 0
        high = len(arr) - 1

        while high - low >= k:
            if abs(arr[low] - x) > abs(arr[high] - x):
                low += 1
            else:
                high -= 1
        
        for i in range(low, high + 1):
            result.append(arr[i])

        return result