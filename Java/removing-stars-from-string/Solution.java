class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.add(s.charAt(i));
            }

            if (!stack.isEmpty() && s.charAt(i) == '*' && stack.peek() != '*') {
                stack.pop();
            }

        }

        StringBuilder result = new StringBuilder();
        for (Character ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
}