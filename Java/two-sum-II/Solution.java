//Runtime complexity of this program is O(n) because we iterate through the array once using two pointers
//Space complexity is O(1) because we are not using any additional space and return array only contains 2 elements.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < numbers.length && right < numbers.length) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[] {};
    }
}