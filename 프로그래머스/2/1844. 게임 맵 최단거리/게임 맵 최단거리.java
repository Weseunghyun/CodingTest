// class Solution {
//     private int answer = Integer.MAX_VALUE;
//     private int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
//     private int[] dy = {0, 0, -1, 1};
//     private int r, c;

//     public int solution(int[][] maps) {
//         r = maps.length;
//         c = maps[0].length;
//         boolean[][] visited = new boolean[r][c];

//         // DFS 탐색 시작
//         DFS(0, 0, 1, maps, visited);

//         // 도착할 수 없으면 -1 반환
//         return (answer == Integer.MAX_VALUE) ? -1 : answer;
//     }

//     private void DFS(int x, int y, int count, int[][] maps, boolean[][] visited) {
//         // 목적지 도착
//         if (x == r - 1 && y == c - 1) {
//             answer = Math.min(answer, count);
//             return;
//         }

//         // 방문 체크
//         visited[x][y] = true;

//         // 네 방향 이동 (상, 하, 좌, 우)
//         for (int i = 0; i < 4; i++) {
//             int nx = x + dx[i];
//             int ny = y + dy[i];

//             // 유효한 범위 내에 있고, 벽이 아니며, 방문하지 않은 곳만 이동
//             if (nx >= 0 && nx < r && ny >= 0 && ny < c && maps[nx][ny] == 1 && !visited[nx][ny]) {
//                 DFS(nx, ny, count + 1, maps, visited);
//             }
//         }

//         // 백트래킹 (다른 경로 탐색을 위해 방문 해제)
//         visited[x][y] = false;
//     }
// }

import java.util.*;

class Solution {

    //상하좌우로 움직일때 행값인 x값의 변화와 y값의 변화를 쌍으로 배열로 만듬
    int[] dx = new int[] { -1, 1, 0, 0 };
    int[] dy = new int[] { 0, 0, -1, 1 };
    
    public int solution(int[][] maps) {
        int r = maps.length; //행의 길이
        int c = maps[0].length; //열의 길이
        
        //방문 여부 확인
        boolean[][] visited = new boolean[r][c];
        visited[0][0] = true;
        //maps 방문확인배열, 끝점 인덱스, 횟수를 넣어줌
        return BFS(maps, visited, r, c,1);
    }
    
    private int BFS(int[][] maps, boolean[][] visited, int r, int c, int count) {
        Queue<int[]> q = new LinkedList<>();
        //초기상태의 q를 세팅
        q.offer(new int[] {0,0,1});
        
        while(!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            count = current[2];
            
            if(x == r-1 && y == c-1) {
                return count;
            }
            
            //상하좌우로 x값을 이동시킴
            for(int i=0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<r && ny<c && !visited[nx][ny] && maps[nx][ny] == 1){
                    q.offer(new int[] {nx,ny,count+1});
                    visited[nx][ny] = true;
                }
            }
        }
        return -1;
    }
}

/*
현재 어느 좌표에있는지 확인해야함.
현재 좌표에서 이미 방문한 좌표이거나 좌표값이 1이거나 존재하지 않는 경우는 안가도록 하면됨.
현재 내 좌표에서 갈 수 있는 방향은 (x+1, y+1), (x+1, y-1), (x-1, y+1), (x-1, y-1)
대신 x는 0보다 작아지거나 c을 넘어설 수 없으며 y는 0보다 작아지거나 r을 넘어서면 안됨 ArrayIndexOut 에러 방지책 필요

조건은 총 4개 x-1이 0보다 작아지면 왼쪽으로는 못감, x+1이 c를 넘어서면 오른쪽으로는 못감
y-1이 0보다 작아지면 위쪽으로 못감, y+1이 r보다 커지면 아래쪽으로 못감

마지막으로 도착지점이 인덱스 끝점으로 갔을 때 answer 값을 해당 count 값으로 바꾼다.
문제를 DFS 를 사용하여 풀어보았지만 효율성 테스트에서 시간초과하는 모습을 보임.
깊이우선 탐색은 한 경로를 끝까지 탐색하고 다시 돌아오는 방식이기 떄문에 더 짧은 경로를 놓칠 가능성이 커서
최단 경로를 구하는 데 적합하지 않다.
따라서 최단거리를 찾기위해서는 BFS 를 적용하는 것이좋다.

또한 이런 2차원배열 좌표를 이동하는 문제가 나왔을때는 이동할때의 각 x,y 값이 증감하는 값을 쌍으로
저장해두고 시작하는게 좋다
예를들어 이 문제에서는 상하좌우로 움직인다 했을때 x는 -1 1 0 0 이고 y는 0,0,-1,1으로 움직인다.
이러한 조건을 각 dx dy 배열로 저장해두고 사용하면 편리하다.
visited를 true로 하는 시점이 중요한데 큐에 추가하는 동시에 방문 표시를 해줘야한다.
*/