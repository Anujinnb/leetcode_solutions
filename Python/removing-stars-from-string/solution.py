class Solution:
    def removeStars(self, s: str) -> str:
        stack = []
        result = ""

        for i in range(len(s)):
            if s[i] != '*':
                stack.append(s[i])
            
            if stack and s[i] == '*' and stack[-1] != '*':
                stack.pop()
        
        stack_string = ''.join(stack)
        
        return stack_string