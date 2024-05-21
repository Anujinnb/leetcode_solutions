class Solution {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int result = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                set.remove(ch);
                result += 2;
            }
        }

        if (!set.isEmpty()) {
            result += 1;
        }

        return result;

    }
}