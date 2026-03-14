class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] mostFreq = new int[k];
        Map<Integer, Integer> allFreq = new HashMap<>();
        for(int num : nums)
        {
            if(!allFreq.containsKey(num))
            {
                allFreq.put(num, 1);
            }
            else
            {
                int freq = allFreq.get(num) + 1;
                allFreq.put(num, freq);
            }
        }
        // Sort Descending
        List<Integer> keys = new ArrayList<>(allFreq.keySet());
        keys.sort((a,b) -> allFreq.get(b) - allFreq.get(a));

        for(int i =0 ; i < k; i++)
        {
            mostFreq[i] = keys.get(i);
        }
        return mostFreq;
    }
}