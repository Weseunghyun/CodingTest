import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();
        int[] answer = new int[targets.length];
        
        // keymap의 각 문자와 최소 인덱스를 맵에 저장
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) { // j++로 수정
                char c = keymap[i].charAt(j);
                if (!map.containsKey(c) || map.get(c) > j) {
                    map.put(c, j);
                }
            }
        }
        
        // targets를 탐색하며 각 문자열의 값을 계산
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char c = targets[i].charAt(j);
                if (map.containsKey(c)) {
                    count += map.get(c) + 1; // 1-based 인덱스 적용
                } else {
                    count = -1;
                    break; // 해당 target에 대해 더 이상 계산 불필요
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}
