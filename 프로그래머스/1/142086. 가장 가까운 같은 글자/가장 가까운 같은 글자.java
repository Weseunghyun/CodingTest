import java.util.*;
class Solution {
    public int[] solution(String s) {
        int length = s.length();
        char[] arr = s.toCharArray();
        int[] answer = new int[length];
        Arrays.fill(answer, -1);
        for(int i=1; i<length; i++){
            for(int j=0; j<i; j++){
                if(arr[j] == arr[i]){
                    answer[i] = i-j;
                }
            }
        }
        
        return answer;
    }
}