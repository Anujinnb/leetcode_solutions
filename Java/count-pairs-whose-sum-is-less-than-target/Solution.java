//Runtime complexity: O(n^2) because outer loop runs from 0 to n - 1 and inner loop runs from left + 1 to n - 1. So n(n - 1) / 2
//leads to n^2
//Space complexity: O(1) because we didn't use any additional data structures and space.

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;

        for (int left = 0; left < nums.size(); left++) {
            for (int right = left + 1; right < nums.size(); right++) {
                if (nums.get(left) + nums.get(right) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}
