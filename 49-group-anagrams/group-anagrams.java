class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> exist = new HashMap<>();
        for(String word: strs)
        {
            char[] wordInChar = word.toCharArray();
            Arrays.sort(wordInChar);
            String key = new String(wordInChar);
            if(!exist.containsKey(key))
            {
                exist.put(key, new ArrayList<>());
            }
            (exist.get(key)).add(word);
        }
        return new ArrayList<>(exist.values());
    }
}