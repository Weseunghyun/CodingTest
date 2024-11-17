import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // 각 숫자의 빈도수를 저장할 배열
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        // X와 Y에서 각 숫자의 빈도를 계산
        for (char c : X.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : Y.toCharArray()) {
            countY[c - '0']++;
        }
        
        // 공통 숫자 조합 계산
        StringBuilder result = new StringBuilder();
        for (int i = 9; i >= 0; i--) { // 큰 숫자부터
            int commonCount = Math.min(countX[i], countY[i]);
            for (int j = 0; j < commonCount; j++) {
                result.append(i);
            }
        }
        
        // 결과 처리
        if (result.length() == 0) {
            return "-1"; // 공통 숫자가 없을 때
        }
        if (result.toString().charAt(0) == '0') {
            return "0"; // 모든 숫자가 0일 때
        }
        return result.toString(); // 최종 결과
    }
}
