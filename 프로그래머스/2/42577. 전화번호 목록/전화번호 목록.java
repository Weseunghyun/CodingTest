import java.util.*;

// class Solution {
//     public boolean solution(String[] phone_book) {
//         Arrays.sort(phone_book);

//         boolean answer = true;

//         for(int i=1; i<phone_book.length; i++) {
//             if(phone_book[i].startsWith(phone_book[i-1])) {
//                 return !answer;
//             }
//         }

//         return answer;
//     }
// }

class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> map = new HashMap<>();
        boolean answer = true;
        
        for(String phone : phone_book) {
            map.put(phone, 1);
            
        }
        
        for(String phone : phone_book) {
            for(int i=1; i<phone.length(); i++){
                if(map.containsKey(phone.substring(0,i))) {
                    return !answer;
                }
            }
        }
                   
        return answer;
    }
}

/*
같은 전화번호가 중복해서 들어가있지 않으므로 무조건 특정 번호가 다른 번호의 접두어인 경우는
해당 특정 번호가 비교군이되는 다른 번호보다 길이가 짧다는 것을 의미한다.
번호는 총 1,000,000 개가 나올 수 있다. 안에있는 모든 번호를 비교할 수 있을까?
그렇게 풀었다가는 시간이 모자랄 것이다.

반복문을 돈다고 쳤을때 해당 번호가 다른번호의 접두어인지 아닌지 확인할 수 있는 방법
Arrays.sort와 startsWith 이용하기.
우선 정렬을 진행하면 사전순 정렬이 이루어지기 때문에 접두어가 존재한다면 무조건 붙어있게된다.
정렬이되어있는 것은 아닌 것 같으니 sort로 정렬하고 반복문을 돌면서 풀면된다.

sort 메서드의 시간복잡도는 참조형배열인 경우 최악 n log n 평균 n log n 의 성능을 보인다.
따라서 sort를 사용하는 편이 좋다.

그치만 이 문제는 왜 해시로 분류되어있을까?? 당연히 해시를 사용하고있기 때문일 것이다.
해시로는 어떻게 풀 수 있을까? 근본은 같다고 생각한다.
해시 맵에는 containsKey 라는 메서드가 존재한다. 이 메서드를 사용할 것이지만 약간의 발상의 전환이 필요하다.
phone book 에 담겨있는 문자열 배열들을 map 에 넣어둔 후에 다시 폰북 길이만큼 반복을 진행한다.
그 반복 내부에서 다시한번 해당 순서 문자열 길이만큼 반복을 진행하는데 i는 1부터 해당 문자열의 길이 -1 까지 반복되어야한다.
왜? map.containsKey(해당문자열.subString(0, i)) 를 해서 해당 조건에 걸리면 접두어가 존재한다는 뜻이고
자기 자신을 map에서 탐색하는 과정을 없애기위해 문자열의 끝 문자는 제외하고 비교해야하기 때문이다.
쉽게 설명하자면 위의 sort+startsWith 방식은 짧은 번호를 사용하여 긴 번호 중 접두어로 들어가는 것이 있는지 찾는 것이었다면
이 방식은 긴 문자열에서 짧은 접두어를 찾아낸다고 생각하면된다.
예를들어 12, 123 이 있을때 12 문자열 반복에서는 i=1; i<"12".length() 로 i<2 이니까 한번만 반복된다.
이때 map.containsKey("12".subString(0, i)) 를 하면 "1" 이 나오고 이건 map에 존재하지 않으니 조건에 걸리지않는다.
그 후 "12" 의 반복이 끝났으니 다음은 "123" 을 반복하면서 map에서 찾아볼 것인데 처음엔 똑같이 0,1 이므로 1이지만
이 반복문의 조건은 i=1; i<"123".length() 로 i<3이니 i=2 인 경우도 반복이 진행되므로
map.containsKey("123".subString(0, 2)) 를 하면 "12" 가 나온다. 이 값은 map에 존재하므로
조건문에 부합하여 조건문 내부가 실행되고 "12" 는 map에 존재하니 false 를 리턴하게 되는것이다.
만약 모든 문자열들이 해당 조건에 부합하는게 없다면 그대로 반복문이 끝나게되고 true 가 리턴된다.
여기서 의아할 수 있는점은 이중 반복문을 사용해도 성능이 나쁘지않다는 것이다. 이는 이중반복문의 각 반복되는 횟수가
서로 다르기 때문이다. 제일 바깥 반복문은 phone_book 배열의 길이만큼 반복되고 1~최대 100만까지 반복된다.
내부에 있는 반복문이 같이 최대 100만까지 실행될 수 있다면 n*n 의 시간복잡도가 나오겠지만
내부 반복문은 정해져있는 전화번호 길이로 1~최대 20까지밖에 되지 않으므로 n*m 해서 O(n) 의 시간복잡도가 나오게된다.
sort+startsWith 방식은 배열을 정렬하는데 nlogn 의 시간복잡도가 이미 걸리므로 해시맵을 사용할때보다
시간이 오래걸리기 때문에 해시를 사용하여 푸는 방식이 더 효율적인 것이다.
*/
