class Solution
{
    public int solution(int n, int a, int b)
    {
        int round = 1;
        boolean flag = true;
        
        int diff = a-b;
            
        if(Math.abs(diff) == 1){
            int max = Math.max(a,b);
            
            if(max%2 == 0){
                 return round;
            }
        }
            
        
        while(flag){
            a = (a%2 == 0) ? (a/2) : (a/2+1);
            b = (b%2 == 0) ? (b/2) : (b/2+1);
            
            int difference = a-b;
            
            if(Math.abs(difference) != 1){
                round++;
                continue;
            }
            
            int max = Math.max(a,b);
            
            if(max%2 == 0){
                flag = false;
            }
            
            round++;
        }

     
        return round;
    }
}
/*
우선 내가 이기고 나서 다음 번호가 몇일지 아는 방법을 생각해보자
내가 부여받은 번호가 홀수라면?
2 로 나눈 후 +1 을 해줘야 다음 번호. ex) 5 -> 2+1 = 3

내가 부여받은 번호가 짝수라면?
2로 나눈 값이 나의 다음 번호.

두 번호가 만나는지 알 수 있는 방법은? 12 34 56
둘 중 더 큰 번호가 짝수 일때 만난다는 것을 알 수 있다.

어떻게 구현할까?
각 참가자의 조기 번호 a,b 를 알고 있다.
둘이 만날 때까지 반복문을 돌아야한다 (flag 변수를 사용할까?)

a,b 가 각각 짝수인지 홀수인지 확인한다. (조건문 or 삼항 연산자 사용)
짝수라면 2를 나눈 값으로 바꾸고 홀수라면 2로 나눈 값 + 1 로 변경한다.

둘 수의 차이가 절댓값을 씌웠을 때 1인지 확인한다.
1이 아니라면 continue;
1이라면 Math 클래스를 사용해 더 큰 값을 확인하고 그 값이 짝수라면 통과

이 한 사이클을 진행할 때마다 값으로 넘겨줄 answerCount 값을 1 증가시킴.

*/