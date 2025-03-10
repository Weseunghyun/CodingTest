class Solution {
    public int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        DFS(dungeons, k, visited, 0);
        return answer;
    }
    
    public void DFS(int[][] dungeons, int k, boolean[] visited, int depth) {
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && k>=dungeons[i][0]) {
                visited[i] = true;
                DFS(dungeons, k-dungeons[i][1], visited, depth+1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
        
    }
}