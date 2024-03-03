//Title: Check if all characters have equal number of occurrences

class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char str = s.charAt(i);
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        
        int count = map.get(s.charAt(0));
        for (Character i : map.keySet()){
            if (map.get(i) != count) {
                return false;
            }
        }
        return true;
    }
}