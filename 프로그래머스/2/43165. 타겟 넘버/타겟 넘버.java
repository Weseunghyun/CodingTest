// class Solution {
//     int answer = 0;
//       public int solution(int[] numbers, int target) {
//         DFS(numbers, 0, 0, target);  // depth = 0, sum = 0
//         return answer;
//     }

//     public void DFS(int[] numbers, int depth, int sum, int target) {
//         // 모든 숫자를 다 사용한 경우
//         if (depth == numbers.length) {
//             if (sum == target) {
//                 answer++;  // 타겟 넘버를 만든 경우
//             }
//             return;
//         }

//         // 현재 숫자를 더한 경우
//         DFS(numbers, depth + 1, sum + numbers[depth], target);

//         // 현재 숫자를 뺀 경우
//         DFS(numbers, depth + 1, sum - numbers[depth], target);
//     }
// }

import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {

        Queue<int[]> queue = new LinkedList<>();

        //sum 과 depth를 넣어준다.
        queue.offer(new int[]{0, 0});

        //최대 방문 횟수
        int n = numbers.length;

        while (!queue.isEmpty()) {
            // 큐에서 추출 sum과 depth
            int[] cur = queue.poll();
            int sum = cur[0];
            int count = cur[1];

            if (count == n) {
                if (sum == target) {
                    answer++;
                }
                continue;
            }

            queue.offer(new int[]{sum + numbers[count], count+1});
            queue.offer(new int[]{sum - numbers[count], count+1});
        }
        return answer;
    }

}

/*
numbers에 들어있는 모든 수를 순회하면서 한번은 + 한번은 -인 경우가 존재한다.
이 때 집중해야할 점은 numbers의 순서대로만 무조건 진행한다는 것이다.
모든 경우를 찾는 것이 아니다 무조건 연산은 0 -> 1 -> 2 ... -> numbers.length-1 순서로 진행된다.
따라서 방문 여부는 필요없고 depth라는 변수를 사용하여 다음 재귀를 호출할때 depth 값을 1 늘려주기만하면
자연스럽게 다음 인덱스 숫자를 더하거나 뺄 수 있다.
depth 가 numbers.length 가 되었을 때 length -1 인 경우의 인덱스 즉 끝 인덱스에 도착했다는 의미를 가지고
재귀호출을 멈춰야한다. 재귀 호출을 멈췄을 때 전달되는 sum 값이 target과 같은 경우 조건에 맞으므로
전역변수로 두었던 answer 값을 1 늘려준다..
*/
