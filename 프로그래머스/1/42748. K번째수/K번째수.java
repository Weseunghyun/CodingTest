import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0];
            int end = commands[i][1];
            int sortIdx = commands[i][2] - 1;
            
            int[] example = new int[end-start+1];
            int idx = 0;
            for(int j=start-1; j<end; j++){
                example[idx++] = array[j];  
            }
            
            Arrays.sort(example);
            answer[i] = example[sortIdx];
        }
        
        return answer;
    }
}