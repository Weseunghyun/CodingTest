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
            }
        }
          
        return answer;
    }
}

/*
동명이인 가능이 키포인트일듯
참여자 명단에만 있고 완주자 명단에 없는 사람을 찾아라
participant 에 담겨있는 이름들을 어떠한 자료형에 넣고
completion 에 들어있는 이름이 해당 자료형에 있는지 contains를


*/