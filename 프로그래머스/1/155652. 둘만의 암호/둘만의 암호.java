import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c : skip.toCharArray()){
            set.add(c);
        }
        
        
        
        for(char ch : s.toCharArray()){
            int count = 0;
            while(count < index){
                ch++;
                
                if(ch > 'z'){
                    ch = 'a';
                }
                
                if(!set.contains(ch)){
                    count++;
                }
            }
            sb.append(ch);
        }
        
        
        
        return sb.toString();
    }
}