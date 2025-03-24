import java.util.*;
class Solution {
    /*
    가로 >= 세로
    가로가 세로보다 길거나 같다라면 안에 노란격자 크기를 잘 구해야한다.
    노란 격자 크기만 구하면 가로 세로 길이는 자연스레 따라오게 될 것
    
    노란색의 개수가 제곱수이면 정사각형이 가능
    노란격자 가로길이 +2 세로길이 +2 가 전체 길이

    우선 제곱수라면 단순히 그 제곱수 +2, +2 해서 답을 리턴
    아니라면 가로길이 x 세로길이를 해서 yellow의 개수가 나오는 경우를 찾는다.
    
    확인해보니 가로길이와 세로길이가 가장 차이가 나지 않는 경우를 찾는다.
    
    1. yellow의 약수를 찾는다. yellow의 절반까지 찾는다. 약수의 쌍을 Map에 저장할까?
    2. key와 value의 차이가 가장 작은 쌍을 찾고 key+2, value+2를 리턴한다.
    */
    public int[] solution(int brown, int yellow) {
        // 노란색이 완벽한 제곱수일 경우 정사각형 확인
        if (Math.sqrt(yellow) % 1 == 0) {
            int len = (int) Math.sqrt(yellow);
            if ((len + 2) * (len + 2) - yellow == brown) {
                return new int[]{len + 2, len + 2};
            }
        }

        Map<Integer, Integer> map = new HashMap<>();
        // 약수 구하기 (1 ~ yellow의 절반까지)
        for (int i = 1; i <= Math.sqrt(yellow); i++) {
            if (yellow % i == 0) {
                int pair = yellow / i;
                map.put(i, pair);
            }
        }

        // 가로 길이 >= 세로 길이 조건에 맞는 경우 찾기
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            //map 에 put 할 때 key값은 작은값 -> 큰값 순서로 들어가기 때문에
            //세로가 더 작거나 같아야하므로 key값을 세로길이 후보로 둔다.
            int h = entry.getKey(); // 세로 길이 후보
            int w = entry.getValue(); // 가로 길이 후보

            // 갈색 격자 확인
            int totalWidth = w + 2;
            int totalHeight = h + 2;

            if ((totalWidth * totalHeight) - yellow == brown) {
                return new int[]{totalWidth, totalHeight};
            }
        }

        // 기본값 (이론상 도달하지 않음)
        return new int[]{};
    }
}