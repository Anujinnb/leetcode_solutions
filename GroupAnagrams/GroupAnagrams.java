class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String sorted_char = new String(chars);

            if (!map.containsKey(sorted_char)) {
                map.put(sorted_char, new ArrayList<>());
            }

            map.get(sorted_char).add(word);

        }

        return new ArrayList<>(map.values());
    }
}