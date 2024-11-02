//I used slightly different approach than first solution.

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while (left < s.length() && right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;

                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return max;

    }
}