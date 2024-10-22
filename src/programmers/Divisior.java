package programmers;

import java.util.HashMap;
import java.util.Map;

public class Divisior {
    //내가 푼 방식
    class Solution {
        public int solution(int left, int right) {
            Map<Integer, Integer> yakMap = new HashMap<>();
            int answer = 0;
            for(int i=left; i<=right; i++){
                yakMap.put(i, 0);
            }

            for(int i=left; i<=right; i++){
                for(int j=1;j<=i;j++){
                    if(i%j==0){
                        yakMap.put(i,yakMap.get(i)+1);
                    }
                }
            }

            for (Map.Entry<Integer, Integer> entry : yakMap.entrySet()){
                int key = entry.getKey();
                int value = entry.getValue();
                if (value%2==0){
                    answer += key;
                }else {
                    answer -= key;
                }
            }
            return answer;
        }
    }

    //다른 사람의 풀이에서 인상깊게 본 풀이
    //제곱수면 약수의 개수가 홀수, 아니면 짝수인 것은 처음 알았다..
    //약수들을 쭉 써놓고 봤더라면 찾을 수도 있었을 패턴.
    class Solution2 {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i=left;i<=right;i++) {
                //제곱수인 경우 약수의 개수가 홀수
                if (i % Math.sqrt(i) == 0) {
                    answer -= i;
                }
                //제곱수가 아닌 경우 약수의 개수가 짝수
                else {
                    answer += i;
                }
            }

            return answer;
        }
    }
}
