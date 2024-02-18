//This solution provides the runtime complexity of O(nlogn). The space complexity of this code is O(2n) ==> O(n).
//Explanation: First, we need to make two strings into arrays of characters. Then, we sort those arrays of characters.
//Then, after it is sorted, we can compare two arrays. If the arrays are equal, then it is anagram.

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();

        Arrays.sort(s_chars);
        Arrays.sort(t_chars);

        return Arrays.equals(s_chars, t_chars);
    }
}