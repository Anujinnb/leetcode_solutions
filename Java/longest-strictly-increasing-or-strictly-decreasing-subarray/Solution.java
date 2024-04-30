class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int increase = 1;
        int decrease = 1;
        int max = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                increase++;
                decrease = 1;
            } else if (nums[i - 1] > nums[i]) {
                decrease++;
                increase = 1;
            } else {
                increase = 1;
                decrease = 1;
            }


            max = Math.max(max, Math.max(increase, decrease));
            
        }

        return max;
    }
}