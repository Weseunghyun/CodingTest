import java.util.*;

class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while(n>0){
            sb.append(n%3);
            n/=3;
        }

        //문자 배열로 변환해서 풀어도 무방. 이게 더 속도 빠름
        char[] arr = sb.reverse().toString().toCharArray();
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += (int)((arr[i] - '0') * Math.pow(3,i));
        }

        // //StringBuilder의 charAt을 이용하여 풀어도 가능.
        // sb.reverse();
        // int result = 0;
        // int length = sb.length();
        // for (int i = 0; i < length; i++) {
        //     result += (int) ((sb.charAt(i) - '0') * Math.pow(3, i));
        // }
        
        return result;
    }
}
