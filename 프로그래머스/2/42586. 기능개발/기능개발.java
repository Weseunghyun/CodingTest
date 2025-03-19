import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        
        //큐 초반 세팅, 첫 인덱스부터 며칠이 걸리는지 계산하여 q에 넣어둠
        for(int i=0; i<progresses.length; i++) {
            int remain = 100-progresses[i];
            int day = remain / speeds[i];
            
            if(remain % speeds[i] != 0) {
                day++;
            }
            
            q.offer(day);
        }
        
        //몇개씩 배포되는지 계산하기 위한 count 변수
        int count = 1;
        //큐가 빌때까지 반복수행
        while(!q.isEmpty()) {
            //우선 큐에서 값을 빼옴
            int compare = q.poll();
            
            //만약 처음 빼온 값 다음 값이 null 이라면 count 더해주고 반복문 종료
            if(q.peek() == null) {
                list.add(count);
                break;
            }
            
            //만약 처음 빼온 값이 다음 값보다 크거나 같다면 그 해당 값을 빼주고 count 를 늘려준다.
            while(compare >= q.peek()) {
                q.poll();
                
                count++;
                if(q.peek()==null) {
                    break;
                }
            }
            
            //반복문을 빠져나왔다는건 맨앞에 있던 비교군의 값보다 더 큰 기간을 가진 값이 나타났다는 것!
            //따라서 list에 해당 count 값을 저장해주고 count 를 1로 초기화해준다.
            list.add(count);
            count = 1;
        }

        
        return list.stream().mapToInt(i -> i).toArray();
    }
}

/*
첫번째 인덱스부터 100이 되려면 얼마나 걸리는지 계산을해야함.
100 - 30 빼고 70나왔을때 스피드가 30 이므로 70/30하고 나머지가 있으면 +1 없으면 나눈 값
즉 (100-progresses)/speeds 
예를들어 7 3 9 일로 큐에 저장을 해뒀다면
우선 q.poll 하면 7 이 나오고 바로 q.peek() 을 하면 3이 나온다
따라서 둘이 같이 배포될 예정이므로 count를 +1 늘려준다.

*/