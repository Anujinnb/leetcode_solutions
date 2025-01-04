class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;

        char[] chars = s.toCharArray();

        while (left < right) {
            if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;
            }

            if (!isVowel(s.charAt(left))) {
                left++;
            }

            if (!isVowel(s.charAt(right))) {
                right--;
            }
        }

         return new String(chars);

    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}