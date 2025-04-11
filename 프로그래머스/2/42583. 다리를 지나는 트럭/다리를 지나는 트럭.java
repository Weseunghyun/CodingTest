// import java.util.*;

// class Solution {
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//         Queue<int[]> truck = new LinkedList<>();
//         int time = 0;
//         int truckIdx = 0;
//         int total_weight = 0;

//         while (truckIdx < truck_weights.length || !bridge.isEmpty()) {
//             time++;

//             // 다리 맨 앞 트럭이 도착 시간 됐으면 제거
//             if (!bridge.isEmpty() && bridge.peek()[1] == time) {
//                 total_weight -= bridge.poll()[0];
//             }

//             // 다음 트럭을 올릴 수 있다면 올림
//             if (truckIdx < truck_weights.length &&
//                 total_weight + truck_weights[truckIdx] <= weight) {
//                 bridge.offer(new int[] {truck_weights[truckIdx], time + bridge_length});
//                 total_weight += truck_weights[truckIdx];
//                 truckIdx++;
//             }
//         }

//         return time;
//     }
// }

import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int total_weight = 0;
        int truckIdx = 0;
        
        //다리의 상태를 비어있는 상태로 초기화
        for(int i=0; i<bridge_length; i++) {
            bridge.offer(0);
        }
        
        //모든 트럭이 들어올 때까지.
        while(truckIdx < truck_weights.length) {
            time++;
            
            //다리에서 순서 한번 지난 취급
            total_weight -= bridge.poll();
            
            if(total_weight + truck_weights[truckIdx] <= weight) {
                bridge.offer(truck_weights[truckIdx]);
                total_weight += truck_weights[truckIdx];
                truckIdx++;
            } else {
                //무게 초과되면 빈공간을 추가
                bridge.offer(0);
            }
        }
        
        return time+bridge_length;
    }
}

/*
이 문제를 풀면서 어려웠던 점은 주체를 트럭에 두었다는 점이다.
트럭의 총 무게, 해당 순서의 트럭이 도착하는 시간을 큐에 넣고 while(!q.isEmpty()) 로 반복하면서 해결하려고 했지만
시간을 관리하기 힘들었고 조건문이 많아져 관리하기가 어려웠다.

주체를 다리로 두고 큐로 구성한다면 훨씬 좋은 풀이가 나올 수 있었다.
*/
