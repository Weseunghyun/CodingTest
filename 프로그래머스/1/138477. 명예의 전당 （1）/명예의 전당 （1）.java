import java.util.*;

class Solution {
//     public int[] solution(int k, int[] score) {
//         //k는 명예의 전당 자리
//         int len = score.length;
//         int[] answer = new int[len];
        
//         int[] castle = new int[k];
//         int min = 2001;
//         int minIdx = 0;
        
//         for(int i=0; i<len; i++){
//             if(i<k){
//                 castle[i] = score[i];
//                 if(min > castle[i]){
//                     min = castle[i];
//                     minIdx = i;
//                 }
//                 answer[i] = min;
//             } else {
//                 if(min < score[i]){
//                     for(int j=0; j<k; j++){
//                         if(castle[j] == min){
//                             castle[j] = score[i];
//                             break;
//                         }
//                     }
                    
//                     min = Arrays.stream(castle).min().getAsInt();
//                 }
//                 answer[i] = min;
//             }
//         }
        
//         return answer;
//     }
    
     public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        //PriorityQueue는 중복값을 허용하고 오름차순으로 값이 자동정렬되는 자료구조이다.
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int temp = 0;

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            //만약 사이즈가 k보다 커지면 값을 빼낸다.
            //이때 현재 큐의 최솟값보다 작은값이 들어와도 정렬되므로 방금 막 들어온 제일 작은 값이 나가지고
            //최솟값보다 큰 값이 들어오면 현재 최솟값이 제거되고 다시 오름차순 정렬된다,.
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            //어짜피 오름차순으로 자동정렬되므로 맨 앞 값을 peek하면 현재 큐의 최솟값이 나오게됨.
            answer[i] = priorityQueue.peek();
        }



        return answer;
    }
}
   