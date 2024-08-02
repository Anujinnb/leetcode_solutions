class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double average = Integer.MIN_VALUE;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            if (right - left + 1 == k) {
                average = Math.max(average, sum);
                sum -= nums[left];
                left++;
            }
        }

        return average / k;
    }
}