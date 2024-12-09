import java.util.*;
class Solution {
    public int[] solution(String s) {
        /*
        1. 문자열에 존재하는 0 을 없앤다.
        2. 문자열의 길이가 1인지 확인
        3. 1이 아니라면 길이를 파악한다
        4. 파악한 길이를 이진 변환을 실행한다.
        5. 길이가 1일 때까지 1~4를 반복한다.
        6. 과정을 반복하면서 제거된 0의 수와 반복횟수를 저장해야한다.

        int repeat 와 int deleteZero 라는 변수를 두고 반복하면서 늘려야할듯

        우선 문자열에 존재하는 0을 없애는 방법은 무엇일까?
        문자열 -> 문자배열 -> 리스트

        리스트를 생성하고 리스트의 size가 1이 될 때까지 과정을 반복한다. while문 사용
        while문 내부에서 list의 size만큼 for문을 돌면서
        만약 list 내부의 Character가 0이라면 제거, deleteZero++

        전부 제거된 후 repeat++ (어쨌든 과정을 한번 진행한 것이기 때문)
        제거된 후 list.size를 저장해두고 나중에 이진변환
        리스트를 다시 생성한다 new ArrayList<>();
        비운 후에 size를 이진변환하면서 list에 추가한다.

        size가 1이 될때까지 알아서 while 반복문이 돌게 된다.
        */

        char[] cArr = s.toCharArray();
        List<Character> list = new ArrayList<>();

        int repeat = 0;
        int deleteZeroCount = 0;
        for (char c : cArr) {
            list.add(c);
        }

        while(list.size() != 1){

            for(int i=0; i<list.size(); i++){
                if(list.get(i) == '0'){
                    list.remove(i);
                    i-=1;
                    deleteZeroCount++;
                }
            }

            repeat++;

            int size = list.size();

            list = new ArrayList<>();

            while(size != 0){
                int remainder = size % 2;
                char character = (char) ('0' + remainder);
                list.add(character);
                size/=2;
            }
        }

        return new int[] {repeat, deleteZeroCount};
    }
}