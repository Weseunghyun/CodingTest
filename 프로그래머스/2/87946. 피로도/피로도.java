// class Solution {
//     public int answer = 0;
    
//     public int solution(int k, int[][] dungeons) {
//         boolean[] visited = new boolean[dungeons.length];
//         DFS(dungeons, k, visited, 0);
//         return answer;
//     }
    
//     public void DFS(int[][] dungeons, int k, boolean[] visited, int depth) {
//         for(int i=0; i<dungeons.length; i++) {
//             if(!visited[i] && k>=dungeons[i][0]) {
//                 visited[i] = true;
//                 DFS(dungeons, k-dungeons[i][1], visited, depth+1);
//                 visited[i] = false;
//             }
//         }
//         answer = Math.max(answer, depth);
        
//     }
// }

import java.util.*;

class Solution {
    public int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{k, 0, 0}); // 현재피로도, 방문한 던전수, 방문 상태(비트마스킹)
        
        int n = dungeons.length;
        int maxDungeon = 0;
        
        //queue 가 비어있지않다면 실행
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int fatigue = current[0]; //현재 피로도
            int count = current[1]; //방문한 던전 수
            int visited = current[2]; //방문 던전 상태
            
            maxDungeon = Math.max(maxDungeon, count);
            
             // 최대 방문 가능 던전 수를 달성하면 종료!
            if (maxDungeon == n) break;

            
            for(int i=0; i<n; i++) {
                int need = dungeons[i][0]; //최소 필요 피로도
                int cost = dungeons[i][1]; //사용 피로도
                
                //방문한 던전인지 체킹
                if((visited & (1 << i)) !=0) continue;
                
                //현재 피로도가 최소 필요 피로도보다 충분한지 체킹
                if (fatigue >= need) {
                    queue.offer(new int[]{fatigue-cost, count+1, visited | (1<<i)});
                }
            }
        }
        return maxDungeon;
    }
}
