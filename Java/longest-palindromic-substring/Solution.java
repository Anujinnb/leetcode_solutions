class Solution {
    public String longestPalindrome(String s) {
        String result = "";
        int result_length = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd length
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > result_length) {
                    result = s.substring(left, right + 1);
                    result_length = right - left + 1;
                }

                left--;
                right++;
            }

            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > result_length) {
                    result = s.substring(left, right + 1);
                    result_length = right - left + 1;
                }

                left--;
                right++;
            }
        }

        return result;
    }
}