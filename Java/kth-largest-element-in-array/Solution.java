//This is a simple solution to the problem of finding the kth largest element in an array. The solution sorts the array in ascending order and then returns the kth largest element. The time complexity of this solution is O(n log n) due to the sorting step.

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            count++;

            if (count == k) {
                return nums[i];
            }
        }

        return 0;
    }
}