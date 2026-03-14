class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        
        Map<Character, Character> par = new HashMap<>();
        par.put(')', '(');
        par.put(']', '[');
        par.put('}', '{');

        Deque<Character> past = new ArrayDeque<>();
        char[] sChar = s.toCharArray();
        for(char c: sChar){
            if(par.containsValue(c)) //if open bracket
                past.push(c);
            else{ //if closing bracket
                if(past.isEmpty() || par.get(c) != past.pop()) return false;
            }

        }

        return past.isEmpty();

    }
}
