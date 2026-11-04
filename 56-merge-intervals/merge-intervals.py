class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort()
        output = []
        for interval in intervals:
            start = interval[0]
            end = interval[1]

            if not output:
                output.append(interval)
            else:
                last= output[-1]
                if start <= last[1]:
                    if end > last[1]:
                        last[1] = end
                else:
                    output.append(interval)
        return output
        