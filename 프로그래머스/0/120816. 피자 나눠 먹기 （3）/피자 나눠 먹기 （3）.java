class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        if(n < slice) {
            return 1;
        }
        while(n>0) {
            n-=slice;
            answer++;
        }
        return answer;
    }
}