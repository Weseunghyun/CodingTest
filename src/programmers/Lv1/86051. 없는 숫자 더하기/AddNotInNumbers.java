package programmers;

public class AddNotInNumbers {
    class Solution {

        public int solution(int[] numbers) {
            int all = 45;
            for (int i : numbers) {
                all -= i;
            }
            return all;
        }
    }
}
