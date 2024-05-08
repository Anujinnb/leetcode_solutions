class Solution {
    public int minimumDifference(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int diff = Integer.MAX_VALUE;

        if (k == 1) {
            return 0;
        }

        Arrays.sort(nums);
        
        while (right < nums.length) {
            diff = Math.min(diff, nums[right] - nums[left]);
            left++;
            right++;
        }

        return diff;
    }
}