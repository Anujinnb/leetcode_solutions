# The runtime complexity of this program is O(n) because we traverse through the string once.
# Space complexity is O(n) due to the creation of new strings during the lowercase conversion and removal of non-alphanumeric characters.

# Explanation: First, we check if string is empty or not. If string is empty, we just return true. Then, we convert the string to lowercase and remove any non-alphanumeric characters.
# Then we use two pointers: one starts at from the beginning of string, another one starts from the end of string. We compare the element at each pointer. If two characters don't match,
# we just return false. Otherwise, we traverse until two pointers meet in the middle.

class Solution:
    def isPalindrome(self, s: str) -> bool:
        if not s:
            return True
        
        s = s.lower()
        s = re.sub(r"[^a-zA-Z0-9]", "", s)

        left = 0
        right = len(s) - 1

        while left < right:
            if s[left] != s[right]:
                return False
            
            left += 1
            right -= 1

        return True
                