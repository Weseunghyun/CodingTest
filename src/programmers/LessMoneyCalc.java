package programmers;

public class LessMoneyCalc {
    class Solution {
        public long solution(int price, int money, int count) {
            // 들어오는 매개변수는 int 형이므로 주의!
            // 하지만 long타입이 더 크므로 묵시적 형변환이 일어날 것
            long sum = 0L;
            //price가 3이고 count가 4일때 진행과정
            //0 + 3 * 1 (첫번째 카운트)
            //3 + 3 * 2 (두번째 카운트).. 쭉쭉 진행
            for(int i=1; i<=count; i++){
                sum += price * i;
            }
            if (money >= sum){
                return 0;
            }
            long answer = sum - money;

            return answer;
        }
    }
}
