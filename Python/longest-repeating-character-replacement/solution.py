class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        hashset = set()
        result = 0

        for ch in s:
            hashset.add(ch)

        for ch in hashset:
            count = 0
            left = 0

            for right in range(len(s)):
                if s[right] == ch:
                    count += 1
                
                while (right - left + 1) - count > k:
                    if s[left] == ch:
                        count -= 1
                    
                    left += 1

                result = max(result, right - left + 1)
        
        return result