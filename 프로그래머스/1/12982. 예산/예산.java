import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int amount = 0;
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++) {
            amount += d[i];
            if(amount <= budget) {
                answer++;
            } else {
                return answer;
            }
        }
        return answer;
    }
}