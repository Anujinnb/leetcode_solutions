class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int left = (i == 0) ? 0 : nums[i - 1];
            int right = (i == nums.length - 1) ? 0 : nums[i + 1];

            left_sum += left;
            right_sum = sum - left_sum - nums[i];

            if (left_sum == right_sum) {
                return i;
            }
        }
        return -1;
    }
}