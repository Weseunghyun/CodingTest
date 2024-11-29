import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('R', 0);
            put('T', 0);
            put('C', 0);
            put('F', 0);
            put('J', 0);
            put('M', 0);
            put('A', 0);
            put('N', 0);
        }};
       
        String answer = "";
        
        int len = survey.length;
        
        for(int i=0; i<len; i++){
            char[] arr = survey[i].toCharArray();
            
            if(choices[i] < 4){
                map.put(arr[0], map.get(arr[0]) + (4-choices[i]));
            }
            
            if(choices[i] > 4){
                map.put(arr[1], map.get(arr[1]) + (choices[i]-4));
            }
            
            if(choices[i] == 4){
                continue;
            }
        }
        
        char one = map.get('T') > map.get('R') ? 'T' : 'R';
        char two = map.get('F') > map.get('C') ? 'F' : 'C';
        char three = map.get('M') > map.get('J') ? 'M' : 'J';
        char four = map.get('N') > map.get('A') ? 'N' : 'A';
        
        return answer + one + two + three + four;
    }
}