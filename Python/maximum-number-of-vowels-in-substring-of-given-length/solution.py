class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        count = 0

        for i in range(k):
            if self.isVowel(s[i]):
                count += 1

        maxVowels = count

        for i in range(k, len(s)):
            if self.isVowel(s[i]):
                count += 1
            
            if self.isVowel(s[i - k]):
                count -= 1
            
            maxVowels = max(maxVowels, count)
        
        return maxVowels

    def isVowel(self, ch: str) -> bool:
        if ch == 'a' or ch == 'e' or ch == 'i' or ch == 'o' or ch == 'u':
            return True
        
        return False