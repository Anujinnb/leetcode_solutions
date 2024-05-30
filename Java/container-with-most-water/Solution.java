//Explanation: Use two pointers: one at first index and another one at last index (since we need to maximize the area). If left one is smaller
//than the right one, we increment the left pointer. If right one is smaller, then we decrement the right pointer and move to the left. 
//Then, we calculate the area by taking minimum of left or right (height) and width.

//Runtime complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int result = 0;

        while (left < right) {
            area = Math.min(height[left], height[right]) * (right - left);
            result = Math.max(result, area);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}