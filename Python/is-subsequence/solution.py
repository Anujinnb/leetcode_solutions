# The solution takes runtime complexity of O(n) and space complexity of O(1)

class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        i = 0
        j = 0

        while (i < len(s) and j < len(t)):
            if (t[j] == s[i]):
                i += 1
                j += 1
            else:
                j += 1
        
        if (i == len(s)):
            return True
        
        return False
        