//The solution takes runtime complexity of O(n) and space complexity of O(1)

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        if (i == s.length()) {
            return true;
        }

        return false;
    }
}