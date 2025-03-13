import java.util.*;
class Solution {
      public String solution(String[] participant, String[] completion) {
        Map<String, Integer> cmap = new HashMap<>();
        Map<String, Integer> pmap = new HashMap<>();
        String answer = "";
          
        for (String s : completion) {
            cmap.put(s, cmap.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            pmap.put(s, pmap.getOrDefault(s, 0) + 1);
            if (cmap.get(s) == null || cmap.get(s) < pmap.get(s)) {
                answer = s;
                break;
            }
        }
          
        return answer;
    }
}

/*
동명이인 가능이 키포인트일듯
참여자 명단에만 있고 완주자 명단에 없는 사람을 찾아라
따지고보면 participant, completion 명단에 있는 사람들의 이름과 횟수를 map으로 저장한다 했을때
pmap에 있는 key 값 중 cmap에는 존재하지 않거나 (null)
pmap 에 있는 value 값보다 cmap에 있는 value값이 더 작은 경우에 해당하는 이름이 답인 것이다.
즉 1번째 예시로 leo 1 kiki 1 eden 1 인데 completion은 eden 1 kiki 1 이다 cmpa.get(leo) 는 null일 것이다.
3번째 예시는 mislav 2 stanko 1 ana 1 이고 completion은 stanko 1 ana 1 mislav 1 이므로 
cmap.get(mislav) < pmap.get(mislav) 가 성립한다.

해당 조건을 사용해서 풀 때 주의할 점은 map.get 의 반환 타입이 primitie 가 아닌 Integer 객체 타입이라는 것이다
따라서 혹여나 비교연산자 != 같은 경우를 사용한다면 같은 값이라도 서로 다른 객체로 인식하므로 답이 도출되지 않을 수 있다.
*/