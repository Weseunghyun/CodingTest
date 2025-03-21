class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        for(int q[] : queries) {
            for(int i=q[0]; i<=q[1]; i++) {
                arr[i] += 1;
            }
        }
        
        return arr;
    }
}

// import java.util.*;
// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         int[] answer = {};
//         Map<Integer, Integer> map = new HashMap<>();
        // for(int[] q : queries) {
        //     map.put(q[0], map.getOrDefault(q[0], 0) + 1);
        //     map.put(q[1], map.getOrDefault(q[1], 0) + 1);
        // }
//         return answer;
//     }
// }