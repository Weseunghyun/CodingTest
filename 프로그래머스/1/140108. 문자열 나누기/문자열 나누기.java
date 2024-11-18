public class Solution {
    public int solution(String s) {
        int answer = 0;
        char[] arr = s.toCharArray();
        
        int count = 0;       // 기준 문자(x)의 개수
        int otherCount = 0;  // x가 아닌 문자 개수
        char currentChar = arr[0]; // 기준 문자(x) 설정

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == currentChar) {
                count++;
            } else {
                otherCount++;
            }

            // 기준 문자와 다른 문자의 개수가 같아지는 순간 분리
            if (count == otherCount) {
                answer++;
                if (i + 1 < arr.length) {
                    currentChar = arr[i + 1]; // 다음 문자로 기준 변경
                }
                count = 0;
                otherCount = 0;
            }
        }

        // 마지막으로 남은 문자열 처리
        if (count != 0 || otherCount != 0) {
            answer++;
        }

        return answer;
    }
}
