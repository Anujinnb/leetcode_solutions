class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
}