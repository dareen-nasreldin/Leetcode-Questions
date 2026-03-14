import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        
        for(String str : strs){
            char[] word_char = str.toCharArray();
            Arrays.sort(word_char);
            String key = new String(word_char);
            
            // If key empty, start new List
            if(!group.containsKey(key))
            {
                group.put(key, new ArrayList<>());
            }

            (group.get(key)).add(str);
        }
        return new ArrayList<>(group.values());
    }
}