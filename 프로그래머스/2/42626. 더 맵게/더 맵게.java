import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    
        for(int s : scoville) {
            pq.offer(s);
        }
        
        //가장 위에있는 값이 K보다 작은 경우 or 큐의 사이즈가 1이 아닌 경우 반복
        while(pq.peek() < K && pq.size() != 1) {
            int first = pq.poll();
            int second = pq.poll();
            
            int newScov = first + (second * 2);
            
            pq.offer(newScov);
            answer++;
        }
        
        if(pq.size()==1) {
            if(pq.peek() < K) {
                return -1;
            }
        }
        
        return answer;
    }
}

/*
제일 낮은 스코빌 지수와 두번째로 낮은 스코빌 지수를 찾아서 합쳐야함.
자료구조 어떤걸 써야할까?
힙은 안배웠음

Java의 PriorityQueue 를 사용하면 매우 쉽게 풀이가 가능하다.
이는 최소힙으로 들어가는 값을 작은 순으로 정렬 시켜준다.
*/