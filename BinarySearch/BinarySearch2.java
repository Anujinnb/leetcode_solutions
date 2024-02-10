// This solution provides runtime complexity of O(log n) for this problem.
// We need to divide the array to two different parts. If the target number is lower than the middle number, then the target
// exists in the lower part of the array. Otherwise, it is in the upper part of the array.

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
