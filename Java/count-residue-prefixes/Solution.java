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