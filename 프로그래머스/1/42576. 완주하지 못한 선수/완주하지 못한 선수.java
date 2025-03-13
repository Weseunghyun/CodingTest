import java.util.*;

class Solution {
    
    public String solution(String[] participant, String[] completion) {
        
        Map<String, Integer> pmap = new HashMap<>();
        Map<String, Integer> cmap = new HashMap<>();
        String answer = "";
        
        for(String p : participant) {
            pmap.put(p, pmap.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            cmap.put(c, cmap.getOrDefault(c, 0) + 1);
        }
        
        for(String p : participant) {
            if(cmap.get(p) == null || cmap.get(p) < pmap.get(p)) {
                return p;
            }
        }
        
        return answer;
    }
}