package programmers;
import java.util.*;
public class StringDesc {
    //내가 푼 풀이
    class Solution {
        public String solution(String s) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr); // 오름차순 정렬

            // 내림차순으로 바꾸기 위해 배열을 뒤집기
            for (int i = 0; i < arr.length / 2; i++) {
                char temp = arr[i];
                arr[i] = arr[arr.length - 1 - i];
                arr[arr.length - 1 - i] = temp;
            }

            // char 배열을 String으로 변환
            String answer = String.valueOf(arr);
            return answer;
        }
    }

    //발견한 신박한 풀이
    //StringBuilder 를 사용했는데 String빌더에 reverse() 기능이 있는 줄은 몰랐다.
    class Solution2 {
        public String solution(String s) {
            char[] sol = s.toCharArray();
            Arrays.sort(sol);
            return new StringBuilder(new String(sol)).reverse().toString();
        }
    }
}
