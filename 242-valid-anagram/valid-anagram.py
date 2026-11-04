class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False

        letters = {}
        for ls, lt in zip(s, t):
            letters[ls] = letters.get(ls, 0) + 1
            letters[lt] = letters.get(lt, 0) - 1

        for letter in letters:
            if letters[letter] != 0:
                return False
    
        return True

        