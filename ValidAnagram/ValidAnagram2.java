//This solution provides the runtime complexity of O(nlogn). The space complexity of this code is O(2n) ==> O(n)

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();

        Arrays.sort(s_chars);
        Arrays.sort(t_chars);

        return Arrays.equals(s_chars, t_chars);
    }
}