//Explanation: First, check if string is empty or not. Using hashset, if character doesn't exist in the hashset, we add to the hashset.
//If character does exist in the hashset, then we remove that character from the set and increment the result by 2 because we assume that 
//we use that character twice. Finally, if the set is not empty (the characters that has count of 1), then we simply add that one to the result.

class Solution {
    public int longestPalindrome(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int result = 0;
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                set.remove(ch);
                result += 2;
            }
        }

        if (!set.isEmpty()) {
            result += 1;
        }

        return result;

    }
}