//Time compleixty: O(n) because we traverse the string once 
//Space complexity: O(1) because the HashSet size is limited to 26 characters, which is constant space.

class Solution {
    public int residuePrefixes(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch); 
            }

            if (set.size() == (i + 1) % 3) {
                count++;
            }
        }

        return count;
    }
}