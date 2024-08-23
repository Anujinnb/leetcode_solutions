//1. Time complexity is O(n). The for-loop runs from i = 2 to i = n. 
//This loop executes n - 1 times, which is proportional to n.
//2. The space required is proportional to n, leading to a space complexity of O(n).

class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}