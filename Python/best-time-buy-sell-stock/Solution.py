import sys

class Solution(object):
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        result = 0
        min_value = sys.maxsize

        for price in prices:
            if price < min_value:
                min_value = price
            else:
                result = max(result, price - min_value)

        return result
