import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> nameYearnMap = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            nameYearnMap.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){
            int sum = 0;
            for(int j=0; j<photo[i].length; j++){
                if(nameYearnMap.containsKey(photo[i][j])) {
                    sum += nameYearnMap.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}

/*
name 배열은 사람들의 이름이 담겨있음
yearning 배열은 name 과 대응됨,
photo 배열은 name 에 있는 사람들이 담겨있음
그 때 사진에 담겨있는 사람들의 이름과 그리움 점수를 대입해서 총 점수를 알아내면됨.

예시를 보니 사진 문자열 배열에 name 배열에 존재하지 않는 이름이 있을 수 있음
그러니 name 에 존재하는 이름인지 확인하고 있다면 그 순서의 yearning 을 가져와서 더하면 됨.
총 반복횟수는 photo 배열의 길이만큼 진행하면됨.

*/