class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        seen = set()
        left = 0
        best = 0

        for right in range(len(s)):
            char = s[right]
            while char in seen:          # shrink from the left until char is gone
                seen.remove(s[left])
                left += 1
            seen.add(char)
            length = right - left + 1    # current window size
            if length > best:
                best = length

        return best