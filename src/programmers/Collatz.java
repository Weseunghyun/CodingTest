package programmers;

public class Collatz {
    class Solution {
        public int solution(int num) {
            int answer = 0;
            long sample = num;
            if(num == 1){
                return 0;
            }
            while(sample!=1){
                if(sample%2==0){
                    sample/=2;
                }else
                    sample = sample*3+1;

                answer++;

                if(answer>500){
                    answer = -1;
                    break;
                }

            }
            return answer;
        }
    }
}
