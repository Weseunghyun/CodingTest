import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for (char n : number.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peek() < n) {
                stack.pop();
                k--;
            }
            
            stack.push(n);
        }
        
        while(k != 0) {
            stack.pop();
            k--;
        }
    
        
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}

/*
순서는 뒤바껴서는 안됨 기존 순서를 유지하고 2개를 삭제해야하는 것.
sb.setLength(0)
*/