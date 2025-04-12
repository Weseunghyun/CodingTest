import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        //높은 순으로 정렬되도록 함.
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        int answer = 0;
        for(int p : priorities) {
            pq.offer(p);
        }
        System.out.println(pq);
        
        //해당 location이 마지막 순서임을 대비하여 pq가 빌때까지 실행을 진행.
        while(!pq.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                //현재 대기중인 프로세스 우선순위 값과, 내림차순으로 정렬한 프로세스 우선순위가 같다면
                if(priorities[i] == pq.peek()) {
                    answer++; //실행된 횟수 증가
                    //만약 해당 대기 위치가 원하는 위치라면 현재까지 실행된 횟수 리턴
                    if(i == location) {
                        return answer;
                    }
                    
                    //원하는 위치가 아니라면 내림차순 정렬해둔 프로세스 하나 실행된 것이므로 빼내기
                    pq.poll(); 
                }
            }
        }
        
        return answer;
    }
}
// import java.util.*;

// class Solution {
//     public int solution(int[] priorities, int location) {
//         //현재 대기 큐 상태 + 로케이션을 구현할 큐
//         Queue<int[]> q = new LinkedList<>();
//         //높은 우선순위를 정리할 큐
//         Queue<Integer> p = new LinkedList<>();
        
//         int answer = 0;
        
//         //우선 배치되어있는 순 대로 q를 초기화해준다.
//         for (int i=0; i<priorities.length; i++) {
//             q.offer(new int[] {priorities[i], i});
//         }
        
//         //우선순위 높은 순으로 큐에 저장해준다.
//         Arrays.sort(priorities); //우선 오름차순으로 배열 정렬 후
//         //큐에 큰 값부터 넣어주기위해 끝 인덱스부터 넣어 초기화해준다.
//         for(int i=priorities.length-1; i>=0; i--) {
//             p.offer(priorities[i]);
//         }
        
//         while(true) {
//             //대기 프로세스에 있는 프로세스를 꺼낸 후
//             int[] arr =  q.poll();
//             System.out.println("실행됨");
//             System.out.println(Arrays.toString(arr));
            
//             System.out.println(answer);
//             //우선순위로 내림차순 정렬해둔 큐의 우선순위 값보다 작으면
//             if(arr[0] < p.peek()) {
//                 //해당 배열을 다시 q에 넣어줌
//                 q.offer(arr);
//             } 
//             //만약 꺼낸 값의 우선순위가 p 에서 꺼낸 값보다 크거나 같으면
//             else {
//                 //다시 q에 집어넣지 않고 해당 프로세스는 없어지며 p에서도 하나를 뺀다.
//                 answer++;
//                 p.poll();
//                 //만약 빼내진 값의 location이 주어진 location과 같다면 반복을 멈춘다.
//                 if(arr[1] == location) {
//                     break;
//                 }
//             }
//         }
//         return answer;
//     }
// }

/*
현재 대기중인 프로세스보다 큰 우선순위가 있다면 다시 넣어야함.
큰 것이 없다면 그냥 빼면 됨.
큐에서 넣고 빼는 과정을 반복하다가 location 에 해당하는 값이 빠지면 종료.
일단 프로세스가 실행되든 안되는 location에 해당하는 위치를 -1 씩 당겨야함.
맨앞 대기중 프로세스보다 큰 우선순위가 있는지 아는 방법은?
큐를 2개 사용하여 풀어보았다.

하지만 PriorityQueue를 사용하여 푸는 방법도 존재했다.
*/