//This solution uses exactly same approach as Solution 1, but I created separate function in this solution.

class Solution {
    private String result = "";
    private int result_length = 0;

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            // Odd length
            palindromeSubstring(s, i, i);

            // Even length
            palindromeSubstring(s, i, i + 1);
        }

        return result;
    }

    private void palindromeSubstring(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            if (right - left + 1 > result_length) {
                result = str.substring(left, right + 1);
                result_length = right - left + 1;
            }
            left--;
            right++;
        }
    }
}
