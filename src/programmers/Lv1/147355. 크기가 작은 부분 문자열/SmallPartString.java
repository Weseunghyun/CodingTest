package programmers;

public class SmallPartString {
    class Solution {
        public int solution(String t, String p) {
            int answer = 0;
            int length = p.length();

            // t의 길이가 p보다 짧으면 0을 반환
            if (t.length() < length) {
                return 0;
            }

            // p를 정수로 변환
            long pValue = Long.parseLong(p); // p는 최대 18자리까지 가능하므로 long으로 변환

            for (int i = 0; i <= t.length() - length; i++) {
                String compare = t.substring(i, i + length);
                long compareValue = Long.parseLong(compare); // compare도 long으로 변환

                if (compareValue <= pValue) {
                    answer++;
                }
            }

            return answer;
        }
    }

}
