import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%3);
            n/=3;
        }
        
        char[] arr = sb.reverse().toString().toCharArray();
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += (int)((arr[i] - '0') * Math.pow(3,i));
        }
        
        return result;
    }
}
