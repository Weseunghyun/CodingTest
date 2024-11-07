class Solution {
    public int[] solution(int n, int m) {
        //두 수의 최대공약수의 최대 범위는 small을 넘어가지 않는다.
        //왜냐면 작은 수의 약수에 무조건 포함되어야하기 때문.
        //최소공배수는 두 수를 곱한 값에 최대 공약수를 나누면된다.
        int min = Math.min(n,m);
        int[] answer = new int[2];
        for(int i=1; i<=min; i++){
            if(n%i==0 && m%i==0){
                answer[0] = i;
            }
            answer[1] = (n*m) / answer[0];
        }
        
        return answer;
    }
}