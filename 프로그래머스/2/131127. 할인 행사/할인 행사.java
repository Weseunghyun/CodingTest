import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        // 원하는 상품과 수량을 저장하는 Map
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        int result = 0;

        // 슬라이딩 윈도우를 사용하여 10일 간격으로 탐색
        for (int i = 0; i <= discount.length - 10; i++) {
            // 현재 10일간의 상품 수량을 체크할 Map
            Map<String, Integer> currentMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                currentMap.put(discount[j], currentMap.getOrDefault(discount[j], 0) + 1);
            }

            // 원하는 상품 수량과 일치하는지 확인
            boolean isValid = true;
            for (String key : wantMap.keySet()) {
                if (currentMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] want = new String[] {"banana", "apple", "rice", "pork", "pot"};
        int[] number = new int[] {3, 2, 2, 2, 1};
        String[] discount = new String[] {
            "chicken", "apple", "apple", "banana", "rice", "apple",
            "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"
        };
        System.out.println(solution.solution(want, number, discount)); // Output: 3
    }
}


/*
want와 number의 길이는 같으므로 map 을 만들자.
무조건 10일 연속이어야됨

discount 배열을 0부터 돌기 시작해서 map 에 포함되어있고
해당 key가 가지고있는 value 값이 0 보다 크다면 1을 빼고 다음 원소로 넘어감

map을 확인할 때
1. 해당 원소가 map 에 포함되어있는지
2. 해당 상품을 더 사야하는지, 즉 value가 0보다 큰지

이 두가지를 확인해야할듯 하다.
둘 중 하나라도 만족하지 않는다면 map을 초기화시키고
다음 인덱스부터 다시 반복문을 돌도록 설정

우선 Map을 생성하고 key value 값을 넣어보도록하자.

나는 처음에 10일 count 를 성공시키는 가장 처음의 인덱스를 찾는 문제인줄 알앗는데
가능한 모든 일의 개수를 찾는거더라..

그렇다면 초기에 저장한 map 과 인덱스 0부터 10일 간격으로 가능한 경우들을 조사한다.
예를들어 1번 예시에서는 어쨌든 10개가 나오는지 확인하려면 할인기간이 총 14일이므로
인덱스 0~4 총 4번 반복을 돌면서 반복을 돌 때마다 새로운 map을 생성해
0~9 인덱스 key value는 getOrDefault 사용해서 없으면 0 있으면 1 증가하게 한 후
다 추가한 뒤에 초기에 저장한 map 과 같은 수량을 모두 갖는지 확인하고 맞다면 결과 리턴값 +1 해서 횟수 추가
아니라면 다음 반복으로 넘어가도록 진행
1~10, 2~11, 3~12, 4~13 경우도 똑같이 진행한 후 
총 횟수를 return 해주면 된다.

*/