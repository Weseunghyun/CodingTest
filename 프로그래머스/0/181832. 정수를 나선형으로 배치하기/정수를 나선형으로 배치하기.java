class Solution {
    public int[][] solution(int n) {
        // 결과 배열 초기화
        int[][] result = new int[n][n];

        // 방향 벡터 (오른쪽, 아래, 왼쪽, 위쪽 순서)
        int[] dx = {0, 1, 0, -1}; // 행 변화량
        int[] dy = {1, 0, -1, 0}; // 열 변화량

        int x = 0, y = 0, dir = 0; // 현재 위치 (0,0), 방향(오른쪽 시작)
        
        for (int num = 1; num <= n * n; num++) {
            result[x][y] = num; // 현재 위치에 값 채우기
            
            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            // 배열 범위를 벗어나거나 이미 채운 곳이면 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || result[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 전환 (0→1→2→3 순환)
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            // 이동
            x = nx;
            y = ny;
        }
        
        return result;
    }
}
