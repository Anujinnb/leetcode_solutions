//Time complexity of this code is O(nlogn). Sorting the array takes time complexity of O(nlogn).
//Therefore, the overall complexity is nlogn.

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return nums.length;
    }
}