import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
       
        //         int[] answer = new int[commands.length];
        
//         for(int i=0; i<commands.length; i++){
//             int start = commands[i][0];
//             int end = commands[i][1];
//             int sortIdx = commands[i][2] - 1;
            
//             int[] example = new int[end-start+1];
//             int idx = 0;
//             for(int j=start-1; j<end; j++){
//                 example[idx++] = array[j];  
//             }
            
//             Arrays.sort(example);
//             answer[i] = example[sortIdx];
//         }
        
//         return answer;
        
        int[] answer = new int[commands.length];

        //이렇게 copyOfRange를 사용하면 array를 2,3번째 매개변수 사이로 나눠져서 복사하여 새로운 배열을 생성할 수 있음.
        //하지만 속도는 더 느려진다는 점.
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
