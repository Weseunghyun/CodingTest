package programmers;

//삼항연산자의 존재를 잊지말자.
public class PlusMinusEdit {
    class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i=0; i<signs.length; i++){
                answer += absolutes[i] * (signs[i] ? 1: -1);
            }
            return answer;
        }
    }
}
