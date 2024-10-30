package programmers;

import java.util.*;

public class intArray {
    class Solution1 {
        public int[] solution(int[] arr, int divisor) {
            List<Integer> tempList = new ArrayList<>();

            for(int number:arr){
                if(number%divisor == 0){
                    tempList.add(number);
                }
            }

            if(tempList.isEmpty()){
                return new int[] {-1};
            }

            int[] answer = tempList.stream().mapToInt(i->i).toArray();
            Arrays.sort(answer);

            return answer;
        }
    }

    class Solution2 {
        public int[] solution(int[] arr, int divisor) {
            int[] answer = {};
            int index = 0;

            // divisor로 나누어 떨어지는 수의 개수 세기
            for (int number : arr) {
                if (number % divisor == 0) {
                    index++;
                }
            }

            // 나누어 떨어지는 수가 없을 경우 -1 반환
            if (index == 0) {
                return new int[] {-1};
            }

            answer = new int[index];
            index = 0;

            // 나누어 떨어지는 수를 answer에 저장
            for (int number : arr) {
                if (number % divisor == 0) {
                    answer[index] = number;
                    index++;
                }
            }

            Arrays.sort(answer);
            return answer;
        }
    }
}
