package programmers;

import java.util.Arrays;

public class Knumber {
    class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i=0; i<commands.length; i++){
                int start = commands[i][0];
                int end = commands[i][1];
                int numberIdx = commands[i][2];

                int[] example = new int[end-start+1];
                int idx = 0;
                for(int j=start - 1; j<end; j++){
                    example[idx++] = array[j];
                }

                Arrays.sort(example);

                answer[i] = example[numberIdx-1];
            }
            return answer;
        }
    }

    //다른 답
    class Solution2 {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for(int i=0; i<commands.length; i++){
                int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
                Arrays.sort(temp);
                answer[i] = temp[commands[i][2]-1];
            }

            return answer;
        }
    }
}

