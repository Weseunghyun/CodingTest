package programmers;

import java.util.ArrayList;
import java.util.List;

public class DeleteMin {

    class Solution {
        public int[] solution(int[] arr) {
            int length = arr.length;
            if(length == 1){
                return new int[] {-1};
            }
            int min = arr[0];
            int[] answer = new int[length-1];
            int count = 0;

            for(int i=1; i<length; i++){
                if(min>arr[i]){
                    min = arr[i];
                }
            }

            for(int i=0; i<length; i++){
                if(min==arr[i]){
                    continue;
                }else{
                    answer[count++] = arr[i];
                }
            }
            return answer;
        }
    }

    class Solution2 {
        public int[] solution(int[] arr) {
            if (arr.length == 1) return new int[] {-1};
            int min = arr[0];

            for(int i=1; i<arr.length; i++){
                if(min>arr[i])
                    min = arr[i];
            }

            List<Integer> arrList = new ArrayList<>();
            for(int i=0; i<arr.length; i++){
                if(arr[i]==min)
                    continue;
                arrList.add(arr[i]);
            }

            int[] answer = arrList.stream().mapToInt(i -> i).toArray();

            return answer;
        }
    }
}
