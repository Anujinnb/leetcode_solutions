//This solution provides runtime complexity of O(n).
//Explanation: Comparing the hashmaps of the two strings, we can check whether it is anagram or not.
//First, we create hashmap for string s. We check if each character in the string exists in the hashmap. If it exists, then
//we increment the count of that character. If it doesn't exist, then we add the character alongside the count of 1 (occurrence).
//We do the same thing for string t. Finally, we can compare all the items inside the hashmaps.

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> s_map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s_map.containsKey(ch)) {
                s_map.put(ch, s_map.get(ch) + 1);
            } else {
                s_map.put(ch, 1);
            }
        }

        HashMap<Character, Integer> t_map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (t_map.containsKey(ch)) {
                t_map.put(ch, t_map.get(ch) + 1);
            } else {
                t_map.put(ch, 1);
            }
        }

        return s_map.equals(t_map);

    }
}
