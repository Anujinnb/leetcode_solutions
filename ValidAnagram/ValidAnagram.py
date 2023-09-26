class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        dict_s = {}

        for i in range(len(s)):
            ch = s[i]

            if ch in dict_s:
                dict_s[ch] += 1
            else:
                dict_s[ch] = 1

        dict_t = {}

        for i in range(len(t)):
            ch = t[i]

            if ch in dict_t:
                dict_t[ch] += 1
            else:
                dict_t[ch] = 1

        return dict_s == dict_t
