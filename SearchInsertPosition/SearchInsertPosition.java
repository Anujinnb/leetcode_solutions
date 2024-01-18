//This code provides time complexity of O(log n)
//Explanation for the code below: 
//Since this problem should have time complexity of O(log n). So I achieved the result using binary search, which divided the array in half.
//First of all, we get the indices of first number and last number. Then, we can find the middle element of these two indices. 
//After that, we can compare the middle element with target element. If the target element is smaller than middle one, then search the left array.
//If the target element is bigger than middle element, then the target element should be in the upper half of the whole array. 
//If the target is equal to middle, then we should return that index.

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}