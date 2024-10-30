package programmers;

public class Hashard {
    class Solution {
        public boolean solution(int x) {
            boolean answer = true;
            int a=x;
            int hashard = 0;
            while(a>0){
                hashard += a%10;
                a/=10;
            }
            if(x%hashard==0)
                return answer;
            else
                answer = false;
            return answer;
        }
    }
}
