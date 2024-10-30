package programmers;

public class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int small = Math.min(n,m);

        for(int i=1;i<=small; i++){
            if(n%i==0 && m%i==0){
                answer[0] = i;
                answer[1] = (n*m) / i;
            }
        }

        return answer;
    }
}
