class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        result = 0
        
        for right in range(len(prices)):
            if prices[left] < prices[right]:
                result += prices[right] - prices[left]
            
            left = right

        return result