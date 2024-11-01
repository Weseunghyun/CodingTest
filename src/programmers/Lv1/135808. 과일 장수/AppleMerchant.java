package programmers.Lv1;

import java.util.Arrays;
import java.util.Collections;

//내림차순 정렬 답변, stream 사용에 도움을 주는 것 같아 작성
public class AppleMerchant {
    public int solution(int k, int m, int[] score) {
        //k는 최고 점수 점수는 1<= <=k
        //m은 한상자에 담는 사과 개수
        //score는 사과들의 모든 점수이자 총 사과 개수
        //사과의 총 개수가 한 상자에 담는 사과 개수보다 적은 경우가 존재

        //score 내림차순 정렬
        // int 배열을 Integer 배열로 변환
        Integer[] boxedNumbers = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedNumbers, Collections.reverseOrder()); // 내림차순 정렬
        // 다시 int 배열로 변환
        int[] newScore = Arrays.stream(boxedNumbers).mapToInt(Integer::intValue).toArray();

        //총개수가 한박스에 담아야할 사과 개수보다 많을때
        int box = score.length / m; //박스 개수를 구함
        if (box == 0){
            return 0;
        }
        int totalMoney = 0;
        int idx = 0;
        int minScore = 0;
        for(int i=0; i<box; i++){
            for(int j=0; j<m; j++){
                minScore = k;
                if(minScore > newScore[idx]){
                    minScore = newScore[idx];
                }
                idx++;
            }
            totalMoney += minScore * m;
        }

        return totalMoney;
    }
}

//오름차순 정렬
class Solution2 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i=score.length - m; i>=0; i-=m){
            answer += score[i] * m;
        }

        return answer;
    }
}