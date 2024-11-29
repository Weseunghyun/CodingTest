import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>() {{
            put('R', 0);
            put('T', 0);
            put('C', 0);
            put('F', 0);
            put('J', 0);
            put('M', 0);
            put('A', 0);
            put('N', 0);
        }};
       
        StringBuilder sb = new StringBuilder();
        
        int len = survey.length;
        
        for(int i=0; i<len; i++){
            char[] arr = survey[i].toCharArray();
            
            if(choices[i] < 4){
                map.put(arr[0], map.get(arr[0]) + (4-choices[i]));
            }
            
            if(choices[i] > 4){
                map.put(arr[1], map.get(arr[1]) + (choices[i]-4));
            }
            
            if(choices[i] == 4){
                continue;
            }
        }
        
        char one = map.get('T') > map.get('R') ? 'T' : 'R';
        char two = map.get('F') > map.get('C') ? 'F' : 'C';
        char three = map.get('M') > map.get('J') ? 'M' : 'J';
        char four = map.get('N') > map.get('A') ? 'N' : 'A';
        
        return sb.append(one)
                .append(two)
                .append(three)
                .append(four).toString();
    }
}

//메모장 작성 내용
/*
카카오 성격유형 검사

지표번호
1번 R T
2번 C F
3번 J M
4번 A N 

경우의수 총 16가지 mbti 느낌

매우 비동의/ 비동의/ 약간 비동의/ 모르겠음/ 약간 동의/ 동의/ 매우 동의

쌍은 맞추지만 
질문 유형에 따라서 동의와 비동의의 포지션은 바뀔 수 있다.

한 쌍에서 점수가 같으면 사전순으로 빠른 놈으로

지표를 담은 String 배열이 매개변수로 들어옴
 RT or TR or CF or FC
앞에오는 문자 예를들어 RT 일 때는 R 은 비동의 선택지
.T는 동의 선택지가 됨. 순서가 반대면 반대의미겠죠?

choices는 어떤것을 선택했는지
1: 매우 비동의 -> 비동의 3점
2: 비동의 -> 비동의 2점
3: 약간 비동의 -> 비동의 1점
4: 모르겠음 -> 0점
5: 약간 동의 -> 동의 1점
6: 동의 -> 동의 2점
7: 매우 동의 -> 동의 3점

Map을 사용한다? <Character, Integer>
R:0 T:0 C:0 F:0 J:0 M:0 A:0 N:0

choice<4 라면 왼쪽문자에 점수 +1
choice=4 라면 점수 그대로
choice>4 라면 오른쪽 문자에 점수 +1

survey를 toCharArray로 바꾼다? 바꿔서
choice에 따라서 Map 에존재하는 key character의 value값을 늘림
key에 해당하는 밸류 값을 늘리는법
map.put(key, map.get(key)+?);
점수를 다 구한다음에

지표에 맞게 쌍을 구함
String answer에
map.get(R), map.get(T) 해서 value값을 비교한 후
큰 값의 키 값을 answer에 더해줌 -> 수행시간 때문에 StringBuilder사용
*/
