package programmers;

import java.util.*;
public class TwoNumberAdd {
    class Solution {
        public int[] solution(int[] numbers) {
            Set<Integer> numSet = new HashSet<>();

            for(int i=0; i<numbers.length; i++){
                for(int j=0; j<numbers.length; j++){
                    if (i!=j) {
                        numSet.add(numbers[i] + numbers[j]);
                    }
                }
            }


            int[] answer = numSet.stream().mapToInt(i->i).toArray();
            Arrays.sort(answer);
            return answer;
        }
    }
}
