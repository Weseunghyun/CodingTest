import java.util.*;

class Solution {

    public int solution(String[] friends, String[] gifts) {
        //선물지수를 저장할 map
        Map<String, Integer> giftScore = new HashMap<>();
        //이름과 각 이름이 가지는 인덱스를 저장할 map
        Map<String, Integer> nameIdxMap = new HashMap<>();
        //다음달에 받을 선물 개수를 저장할 map
        Map<String, Integer> result = new HashMap<>();

        int idx = 0;
        int len = friends.length;

        String[] index = new String[len];
        //2차원 배열로 누가 누구에게 선물을 주었는지 표현
        int[][] record = new int[len][len];

        //선물 지수 저장을 위한 map 초기 ㅅ
        for (String friend : friends) {
            giftScore.put(friend, 0);
            result.put(friend, 0);
            nameIdxMap.put(friend, idx);
            index[idx] = friend;
            idx++;
        }

        for (String gift : gifts) {
            //공백을 기준으로 앞 뒤를 나눔.
            //앞이 준 사람이니까 선물 주었으므로 +1, 뒤가 받은사람으로 -1 선물지수를 저장
            String[] s = gift.split(" ");
            giftScore.put(s[0], giftScore.get(s[0]) + 1);
            giftScore.put(s[1], giftScore.get(s[1]) - 1);

            //2차원 배열로 주었음을 표기
            record[nameIdxMap.get(s[0])][nameIdxMap.get(s[1])] += 1;
        }

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                String a = index[i];
                String b = index[j];

                int aToB = record[i][j];
                int bToA = record[j][i];

                if (aToB > bToA) {
                    result.put(a, result.get(a) + 1);
                } else if (aToB < bToA) {
                    result.put(b, result.get(b) + 1);
                } else {
                    int aScore = giftScore.get(a);
                    int bScore = giftScore.get(b);

                    if (aScore > bScore) {
                        result.put(a, result.get(a) + 1);
                    } else if (aScore < bScore) {
                        result.put(b, result.get(b) + 1);
                    }
                }
            }
        }

        int answer = -1;

        for (String friend : friends) {
            answer = Math.max(result.get(friend), answer);
        }

        return answer;
    }
}

/*
⚠️ 문제 원인 요약:
- 친구 쌍 (A, B)을 (i, j) 와 (j, i) 두 번 평가하여 선물 수 계산이 2배로 증가함

✅ 해결 전략:
- i < j 조건으로 한 쌍을 단 한 번만 평가하게 제한함
- 쌍마다 누가 더 많이 줬는지 → 선물지수 비교 → 받은 사람 count 증가
- 받은 선물 수 map에서 최댓값 반환

🎯 최종 로직 요약:
1. 선물 기록 분석하여 누가 누구에게 몇 번 줬는지 기록 (2차원 배열)
2. 선물지수 (준 수 - 받은 수) 계산
3. 친구 쌍 마다 한 번만 비교하여 다음 달 선물 수 계산
4. 가장 많이 받은 사람의 개수를 반환
*/

/*
두 사람 중 서로 선물을 더 많이 준 사람이 상대방에게 선물을 받음
선물을 주고받은 기록이 없거나 같다면 선물 준 수 - 선물 받은 수 = 선물지수가 큰 작은 사람에게 받음
주고받지 않거나 선물횟수가 서로 같은 상태에서 지수까지 같다면 선물은 주고받지않는다.

친구들의 이름과 이번 달의 선물기록이 주어질때 다음달에 선물을 가장 많이 받을 친구가 받을 선물의 수가 궁금하다.
동명이인은 없으며 이번 달 선물 기록은 10,000 개 까지 존재한다.
"A B" 이며 준사람이 앞, 받은사람이 뒤다.

서로 선물한 횟수와 각각의 선물 지수가 필요함
선물지수는 내가 선물 준 수를 세고 받은 수도 센 다음에 둘을 빼면됨.
선물횟수가 서로 0일 때만 선물지수를 사용 아니면 안써도됨.
선물 준 사람 받은 사람과 회수를 어떻게 측정할까?

이름과 선물 준 수를 저장하는 map, 이름과 선물 받은 개수를 저장하는 map을 사용해보자
두 map을 이용해서 각각의 선물 점수를 저장하는 map 도 사용하자.

누가 누구에게 줬고 누가 누구에게 받았는지도 알 수 있어야 한다.

예시
muzi frodo 2
ryan muzi 3
frodo muzi 1
frodo ryan 1
neo muzi 1

muzi는 선물을 4개 받고 2개 줌  선물 지수 : -2
frodo는 선물을 2개 받고 2개 줌 선물 지수 : 0
ryan은 선물을 1개 받고 3개 줌  선물 지수 : 2
neo는 선물을 0개 받고 1개 줌   선물 지수 : 1

muzi -> frodo 2, frodo -> muzi 1 : muzi가 받아야함
ryan -> muzi 3, muzi -> ryan 0 : ryan이 받아야함
frodo -> ryan 1, ryan -> frodo 0 : frodo 가 받아야함
neo -> muzi 1, muzi -> neo 0 : neo 가 받아야함
서로 주고받지 않은 쌍은 ryan <-> neo, frodo <-> neo 임 ryan 1개 추가 neo 1개 추가
neo, ryan 2개씩 따라서 2개 리턴


*/