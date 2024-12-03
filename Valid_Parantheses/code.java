class Solution {
    public boolean isValid(String s) {
            Stack<Character> ss = new Stack<>();
            HashMap<Character, Character> m = new HashMap<>();
            m.put(')', '(');
            m.put('}', '{');
            m.put(']', '[');
            for(char c : s.toCharArray()){
                if(m.containsValue(c)){
                    ss.push(c);
                }
                else if(m.containsKey(c)){
                    if(ss.empty() || m.get(c) != ss.pop()){
                        return false;
                    }
                }
        }
            return ss.isEmpty();
    }
}
