class Solution {
    //0, 1, 1, 2, 3, 5, 8, 13 ... n번째 순서의 피보나치 수를 구해야함.
    public int solution(int n) {
        int mod = 1234567;
        
        //초기 0번째 1번째 값을 설정
        int front = 0;
        int behind = 1;
        int fib = 0;
        //2 이상의 n이 입력된 경우 피보나치 수 구하기
        for(int i=2; i<=n; i++){
            fib = (front+behind) % 1234567;
            front = behind;
            behind = fib;
        }
        
        return fib;
    }
}