import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1. 숫자를 문자열 배열로 변환
        String[] strNumbers = Arrays.stream(numbers)
                                    .mapToObj(String::valueOf)
                                    .toArray(String[]::new);

        // 2. 정렬 기준: (b + a).compareTo(a + b) (내림차순 정렬)
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));

        // 3. 정렬된 숫자를 합쳐서 결과 생성
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<strNumbers.length; i++) {
            sb.append(strNumbers[i]);
        }

        String answer = sb.toString();
        // 4. "000" 같은 경우 "0" 반환
        return answer.startsWith("0") ? "0": answer;
    }
}

/*
보자마자 생각나는건 String 배열로 바꾸고 정렬, 순서대로 이어붙여서 리턴
실패 3, 30 이 있으면 303 으로 정렬됨 330 이 되어야함.
문자열의 모든 숫자를 쪼개서 정렬을 해야한다는건데.

그러면 정수 배열을 문자열로 변환 -> 문자열을 toCharArray 로 바꾸어 정렬 -> 정렬된 문자 배열을 다시 문자열 변환
-> 변환된 문자열을 StringBuilder 사용하여 reverse 뒤집음
실패 34 를 43으로 만들어버림.

제한사항
1. 문자열을 문자 배열로 쪼개어 따로 움직일 수 있게해서는 안된다. 한몸으로 조합을 해야한다.
2. 자리수가 높아서 앞쪽에 정렬되더라도 뒤에 큰 숫자가 오면 더 앞으로와야한다. 30, 3 예시 330이 되어야함.

모든 숫자 조합을 구하는 것은 아닐거다. 조건대로 만들면 경우가 너무 많다.
따라서 적절하게 정렬한 다음에 문자열로 바꾸라는건데... 어떻게 정렬하지?

우선 문자 배열을 문자열로 변환하고 정렬을 할 때 정렬 기준을 정해줘야한다.
몰랐는데 compareTo 라는 메서드를 사용하면 두 문자열을 붙였을때 큰값을 기준으로 내림차순 할 수 있다고 한다.
사용하여 내림차순하고 성능을 위해 StringBuilder를 사용하여 하나의 문자열로 만든다.
이 때 String joinedString = String.join("", strNumbers); 메서드를 사용해서 만들 수도 있다.
그 후 리턴해주면 끝
*/