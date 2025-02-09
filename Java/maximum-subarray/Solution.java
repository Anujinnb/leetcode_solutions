//This solution is brute force and has a time complexity of O(n^2). It is not the most efficient solution.
//It passes 205/210 test cases on LeetCode. The solution is not optimal for large input sizes.

class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int total = nums[i];

            if (max < total) {
                max = total;
            }
            
            int j = i + 1;

            while (j < nums.length) {
                total += nums[j];
                max = Math.max(max, total);

                j++;
            }
        }

        return max;
    }
}