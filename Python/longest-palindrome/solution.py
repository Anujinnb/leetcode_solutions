class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        result = 0

        for i in range(len(s)):
            if s[i] not in hashset:
                hashset.add(s[i])
            else:
                hashset.remove(s[i])
                result += 2
        

        if len(hashset) != 0:
            result += 1

        return result