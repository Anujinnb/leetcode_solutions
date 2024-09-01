//This solution is optimal because the time complexity is O(n) using hashset without sorting algorithm

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest = 0;
        int length = 0;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            //start of sequence
            if (!set.contains(num - 1)) {
                length = 0;

                while (set.contains(num + length)) {
                    length++;
                }

                longest = Math.max(length, longest);
            }
        }

        return longest;
    }
}