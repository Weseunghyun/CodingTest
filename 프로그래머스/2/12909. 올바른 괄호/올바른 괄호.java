import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> st = new Stack<>();
        
        char[] arr = s.toCharArray();
        
        if(arr[0] == ')'){
            return !answer;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '(') {
                st.push('(');
            } else if (!st.isEmpty()) {
                st.pop();
            }
            
            
        }
        
        if(st.isEmpty()) {
            return answer;
        } 
        
        return !answer;
    }
}