class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map_text = new HashMap<>();
        HashMap<Character, Integer> map_balloon = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!map_text.containsKey(ch)) {
                map_text.put(ch, 1);
            } else {
                map_text.put(ch, map_text.get(ch) + 1);
            }
        }

        String balloon = "balloon";

        for (int i = 0; i < balloon.length(); i++) {
            char ch = balloon.charAt(i);
            if (!map_balloon.containsKey(ch)) {
                map_balloon.put(ch, 1);
            } else {
                map_balloon.put(ch, map_balloon.get(ch) + 1);
            }
        }

        int result = text.length();

        for (Character ch : map_balloon.keySet()) {
            result = Math.min(result, map_text.getOrDefault(ch, 0) / map_balloon.get(ch));
        }
        return result;

    }
}