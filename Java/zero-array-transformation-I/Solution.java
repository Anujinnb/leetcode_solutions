//This solution is not optimal. The time complexity of this program is O(n^2).

class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            for (int j = left; j <= right; j++) {

                if (nums[j] != 0) {
                    nums[j]--;
                }

                System.out.println(nums[j]);
            }
        }

        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}