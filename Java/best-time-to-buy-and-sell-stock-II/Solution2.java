//Using sliding window technique (2 pointers)

class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int result = 0;

        for (int right = 0; right < prices.length; right++) {
            while (prices[left] > prices[right]) {
                left = right;
            }

            if (prices[left] < prices[right]) {
                result = Math.max(result, prices[right] - prices[left]);
            }
        }

        return result;
    }
}