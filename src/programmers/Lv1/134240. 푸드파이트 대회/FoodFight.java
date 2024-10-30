package programmers;

public class FoodFight {
    class Solution {
        public String solution(int[] food) {
            String answer = "";
            for(int i=1; i<food.length; i++){
                int repeat = food[i]/2;
                for(int j=0;j<repeat; j++){
                    answer += i;
                }
            }

            StringBuilder sb = new StringBuilder(answer);
            String reverse = sb.reverse().toString();

            return answer + "0" + reverse;
        }
    }
}
