import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        for(int i = 0; i < query.length; i++) {
            int q = query[i];
            
            // 짝수 인덱스 → 뒷부분 제거 (query[i] 이후는 버림)
            if(i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, q + 1); // q 인덱스 포함
            }
            // 홀수 인덱스 → 앞부분 제거 (query[i] 이전은 버림)
            else {
                arr = Arrays.copyOfRange(arr, q, arr.length); // q 인덱스 제외
            }
        }
        return arr;
    }
}
