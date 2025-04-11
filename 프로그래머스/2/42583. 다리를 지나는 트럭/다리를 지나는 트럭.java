import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> bridge = new LinkedList<>();
        int time = 0;
        int truckIdx = 0;
        int total_weight = 0;

        while (truckIdx < truck_weights.length || !bridge.isEmpty()) {
            time++;

            // 다리 맨 앞 트럭이 도착 시간 됐으면 제거
            if (!bridge.isEmpty() && bridge.peek()[1] == time) {
                total_weight -= bridge.poll()[0];
            }

            // 다음 트럭을 올릴 수 있다면 올림
            if (truckIdx < truck_weights.length &&
                total_weight + truck_weights[truckIdx] <= weight) {
                bridge.offer(new int[] {truck_weights[truckIdx], time + bridge_length});
                total_weight += truck_weights[truckIdx];
                truckIdx++;
            }
        }

        return time;
    }
}



/*
이 문제를 풀면서 어려웠던 점은 주체를 트럭에 두었다는 점이다.
트럭의 총 무게, 해당 순서의 트럭이 도착하는 시간을 큐에 넣고 while(!q.isEmpty()) 로 반복하면서 해결하려고 했지만
시간을 관리하기 힘들었고 
*/
