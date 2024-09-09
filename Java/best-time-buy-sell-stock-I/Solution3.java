//This problem is exactly same approach as Solution 2, but slightly different code using while loop instead of for loop

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 0;
        int max_profit = 0;

        while (left < prices.length && right < prices.length) {
            if (prices[left] > prices[right]) {
                left = right;
            } else {
                max_profit = Math.max(max_profit, prices[right] - prices[left]);
            }

            right++;
        }

        return max_profit;
    }
}