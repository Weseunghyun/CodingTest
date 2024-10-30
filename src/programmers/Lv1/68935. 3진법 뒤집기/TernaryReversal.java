package programmers;

public class TernaryReversal {
    class Solution {
        public int solution(int n) {
            StringBuilder ternary = new StringBuilder();

            // 3진수로 변환
            while (n > 0) {
                ternary.append(n % 3);
                n /= 3;
            }

            // 3진수 문자열을 뒤집기
            ternary.reverse();

            // 뒤집은 3진수를 10진수로 변환
            int answer = 0;
            int length = ternary.length();
            for (int i = 0; i < length; i++) {
                answer += (ternary.charAt(i) - '0') * Math.pow(3, i);
            }

            return answer;
        }
    }

}
