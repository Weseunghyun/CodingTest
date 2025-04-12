import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        //현재 대기 큐 상태 + 로케이션을 구현할 큐
        Queue<int[]> q = new LinkedList<>();
        //높은 우선순위를 정리할 큐
        Queue<Integer> p = new LinkedList<>();
        
        int answer = 0;
        
        //우선 배치되어있는 순 대로 q를 초기화해준다.
        for (int i=0; i<priorities.length; i++) {
            q.offer(new int[] {priorities[i], i});
        }
        
        //우선순위 높은 순으로 큐에 저장해준다.
        Arrays.sort(priorities); //우선 오름차순으로 배열 정렬 후
        //큐에 큰 값부터 넣어주기위해 끝 인덱스부터 넣어 초기화해준다.
        for(int i=priorities.length-1; i>=0; i--) {
            p.offer(priorities[i]);
        }
        
        while(true) {
            //대기 프로세스에 있는 프로세스를 꺼낸 후
            int[] arr =  q.poll();
            System.out.println("실행됨");
            System.out.println(Arrays.toString(arr));
            
            System.out.println(answer);
            //우선순위로 내림차순 정렬해둔 큐의 우선순위 값보다 작으면
            if(arr[0] < p.peek()) {
                //해당 배열을 다시 q에 넣어줌
                q.offer(arr);
            } 
            //만약 꺼낸 값의 우선순위가 p 에서 꺼낸 값보다 크거나 같으면
            else {
                //다시 q에 집어넣지 않고 해당 프로세스는 없어지며 p에서도 하나를 뺀다.
                answer++;
                p.poll();
                //만약 빼내진 값의 location이 주어진 location과 같다면 반복을 멈춘다.
                if(arr[1] == location) {
                    break;
                }
            }
        }
        return answer;
    }
}

/*
현재 대기중인 프로세스보다 큰 우선순위가 있다면 다시 넣어야함.
큰 것이 없다면 그냥 빼면 됨.
큐에서 넣고 빼는 과정을 반복하다가 location 에 해당하는 값이 빠지면 종료.
일단 프로세스가 실행되든 안되는 location에 해당하는 위치를 -1 씩 당겨야함.
맨앞 대기중 프로세스보다 큰 우선순위가 있는지 아는 방법은?

*/