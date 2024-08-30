//This code involves sorting algorithm. Sorting takes O(nlogn) time complexity.
//Therefore, this solution is not optimal.

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 1;
        int max = 1;

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 1) {
                result++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                result = 1;
            }

            max = Math.max(max, result);
        }

        return max;
    }
}