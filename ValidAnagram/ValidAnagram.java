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
