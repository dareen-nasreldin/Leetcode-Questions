class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        groups = {}
        for word in strs:
            key = "".join(sorted(word))
            if key in groups:
                groups[key].append(word)     # add to the existing list
            else:
                groups[key] = [word]         # start a new list with this word

        return list(groups.values())         # the lists, as a list of lists