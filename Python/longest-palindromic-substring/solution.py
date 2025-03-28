class Solution:
    def longestPalindrome(self, s: str) -> str:
        result = ""
        result_length = 0

        for i in range(len(s)):
            left = i
            right = i
            
            while left >= 0 and right < len(s) and s[left] == s[right]:
                if right - left + 1 > result_length:
                    result = s[left : right + 1]
                    result_length = right - left + 1

                left -= 1
                right += 1
            
            left = i
            right = i + 1

            while left >= 0 and right < len(s) and s[left] == s[right]:
                if right - left + 1 > result_length:
                    result = s[left : right + 1]
                    result_length = right - left + 1

                left -= 1
                right += 1
        
        return result
            