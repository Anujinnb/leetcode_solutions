//This solution is not optimal, it has O(n^2) time complexity.

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int product = nums[i];

            if (max < product) {
                max = product;
            }

            while (j < nums.length) {
                product *= nums[j];
                max = Math.max(max, product);

                j++;
            }
        }

        return max;
    }
}