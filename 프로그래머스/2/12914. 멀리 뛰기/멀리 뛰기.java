class Solution {
    public long solution(int n) {
        
        int answer = 0;
        
        if(n==1){
            return 1;
        }
        
        if(n==2){
            return 2;
        }
        
        int first = 1;
        int second = 2;
        
        for(int i=2; i<n; i++){
            answer = (first+second)%1234567;
            first = second;
            second = answer;
        }
        
        return answer;
    }
}

/*
n 이라는 숫자를 1,2 로 구성할 수 있는 경우의수
순서가 다르면 다른 것이라고 인정한다.

간단히 규칙을 찾아보니 도달하는 방법은
1 -> 1, 2->2, 3->3, 4->5, 5->8, 6->13 ....
앞의 두 경우를 더해서 나오더라. (1,2 는 기본값이 1,2 라고 기준을 잡아야함, 피보나치 비슷한 느낌?)

n 이 1,2 라면 바로 1,2를 리턴하게 한다.
1,2 이상이라면 이제 반복문을 진행하면서 더해줘야하는데 반복문을 얼마나 돌려야할까?
n=3 이라면 1번만 돌면 되고 n=4라면 2번 이므로 i=2; i<n; i++ 로 반복 수행
*/