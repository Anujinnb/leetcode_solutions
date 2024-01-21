class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map_s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map_s.containsKey(ch)) {
                map_s.put(ch, map_s.get(ch) + 1);
            } else {
                map_s.put(ch, 1);
            }
        }

        HashMap<Character, Integer> map_t = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (map_t.containsKey(ch)) {
                map_t.put(ch, map_t.get(ch) + 1);
            } else {
                map_t.put(ch, 1);
            }
        }

        for (char key : map_t.keySet()) {
            if (!map_s.containsKey(key) || map_t.get(key) > map_s.get(key)) {
                return key;
            }
        }

        return 0;
    }
}