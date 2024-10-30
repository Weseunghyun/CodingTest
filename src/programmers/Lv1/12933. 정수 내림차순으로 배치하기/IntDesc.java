package programmers;
import java.util.*;
public class IntDesc {
    class Solution {
        public long solution(long n) {
            // n을 문자열로 변환하여 문자 배열로 저장
            char[] digits = String.valueOf(n).toCharArray();

            // 문자 배열을 정렬 (내림차순)
            Arrays.sort(digits);

            // 정렬된 배열을 역순으로 새로운 문자열 생성
            StringBuilder sortedNumber = new StringBuilder(new String(digits)).reverse();

            // 결과를 long으로 변환하여 리턴
            return Long.parseLong(sortedNumber.toString());
        }
    }
}
