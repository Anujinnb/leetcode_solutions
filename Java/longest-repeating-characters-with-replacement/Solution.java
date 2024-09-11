class Solution {
    public int characterReplacement(String s, int k) {
        HashSet<Character> set = new HashSet<>();
        int result = 0;

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch : set) {
            int count = 0;
            int left = 0;
            
            for (int right = 0; right < s.length(); right++) {
                if (s.charAt(right) == ch) {
                    count++;
                }

                while ((right - left + 1) - count > k) {
                    if (s.charAt(left) == ch) {
                        count--;
                    }

                    left++;
                }

                result = Math.max(result, right - left + 1);
            }
        }

        return result;
    }
}