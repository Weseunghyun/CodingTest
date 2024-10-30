package programmers;

public class Coke {
    class Solution {
        public int solution(int a, int b, int n) {
            //a는 교환 병 수, b는 콜라 개수, n은 총 빈병 수
            int answer = 0;
            while(n/a>0){
                answer += n/a * b;

                n = (n/a) * b + (n%a);
            }

            return answer;
        }
    }
}
