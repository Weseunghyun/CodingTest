// import java.util.*;

// public class Solution {
//     public int solution(int k, int[] tangerine) {
       
//         Map<Integer,Integer> map = new HashMap<>();
        
//         //map 에 종류별 개수를 담는다.
//         for(int tan : tangerine){
//             map.put(tan, map.getOrDefault(tan, 0) + 1);
//         }
        
//         // 개수만 리스트로 추출 후 내림차순 정렬
//         List<Integer> counts = new ArrayList<>(map.values());
//         counts.sort(Collections.reverseOrder());
        
//         int result = 0;
//         int numType = 0;
//         for(int count : counts){
//             result += count;
//             numType++;
            
//             if(result>=k){
//                 break;
//             }
//         }
        
//         return numType;
//     }
// }

/*
k개의 귤을 상자에 담는다. 상자에 담을 때 크기의 종류가 최대한 적도록 담는다.
tangerine 배열을 k만큼 돌렸을 때 가장 종류가 적게 나오도록 하는 방법

설명의 예시를 통해 생각해보자.
tangerine 배열을 정렬해보면 [1,2,2,3,3,4,5,5] 가 된다.
들어있는 크기의 개수를 저장하는 Map 을 사용해볼까?

Map을 사용하면 크기값을 key 값 개수를 value로 둔다.
1:1, 2:2, 3:2, 4:1, 5:2

따지고보면 개수가 많은 종류를 먼저 담아야 가장 적은 종류의 귤을 담는것이
가능하다.
따라서 많은 개수를 가진 귤을 먼저 담도록하려면
map 의 value를 따로 List로 빼와서 내림차순 정렬을하고
개수를 value만큼 더하게 했을 때 k보다 같거나 크다면 거기까지만 담으면된다.
*/
import java.util.*;
public class Solution{
     public int solution(int k, int[] tangerine) {
         int[] sizeCount = new int[10000001];
        
         for(int tan : tangerine){
             sizeCount[tan]++;
         }
         
         List<Integer> countList = new ArrayList<>();
         for(int count : sizeCount){
             if(count != 0){
                 countList.add(count);
             }
         }
         
         countList.sort(Collections.reverseOrder());
         
         int result = 0;
         int answer = 0;
         
         for(int c : countList){
             result += c;
             answer++;
             if(result >= k){
                 break;
             }
         }
         return answer;
     }
}
/*
tangerine 의 원소는 1부터~10,000,000 이다.
tangerine 의 크기만큼의 배열을 생성하고 tangerine 에 들어있는 크기 값의 등장 횟수만큼
해당 크기값을 인덱스로 두고 값을 증가시키고 풀어보자. Map 과는 다른 방식
*/