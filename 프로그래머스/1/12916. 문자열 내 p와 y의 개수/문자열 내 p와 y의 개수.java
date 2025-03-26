import java.util.*;

class Solution {
    boolean solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        s = s.toLowerCase();

        for(char c : s.toCharArray()) {
            if(c == 'p' || c== 'y') {
                map.put(c,map.getOrDefault(c,0) + 1);
            }
        }
        
        if(map.size() == 0) {
            return true;
        }
        
        if(map.get('p') == map.get('y')) {
            return true;
        }
        
        return false;
    }
}