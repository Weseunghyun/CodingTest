import java.util.*;
class Solution {
    public int[] solution(String s) {
//         int length = s.length();
//         char[] arr = s.toCharArray();
//         int[] answer = new int[length];
//         Arrays.fill(answer, -1);
//         for(int i=1; i<length; i++){
//             for(int j=0; j<i; j++){
//                 if(arr[j] == arr[i]){
//                     answer[i] = i-j;
//                 }
//             }
//         }
        
//         return answer;
        
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-map.getOrDefault(ch,i+1);
            map.put(ch,i);
        }
        return answer;
    }
}