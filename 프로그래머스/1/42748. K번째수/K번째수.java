import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];

        for(int i=0; i<len; i++) {
            int firstIdx = commands[i][0] - 1;
            int endIdx = commands[i][1];
            int findIdx = commands[i][2] - 1;
            int[] arr = new int[endIdx - firstIdx];
            
            int idx = 0;
            for(int j=firstIdx; j<endIdx; j++) {
                arr[idx] = array[j];
                idx++;
            }
            
            Arrays.sort(arr);
            
            answer[i] = arr[findIdx];
        }
        
        return answer;
    }
}

