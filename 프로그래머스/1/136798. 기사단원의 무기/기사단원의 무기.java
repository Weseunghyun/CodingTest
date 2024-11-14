class Solution {
    //number는 기사의 수, limit는 공격력 제한 수치, power는 제한 수치를 초과한 기사가 사용해야할 무기 공격력
    public int solution(int number, int limit, int power) {
        //정답을 담을 정수 
        int answer = 0;
        
        //기사의 수만큼 약수의 개수를 담을 무언가가 필요하지 않을까?
        int[] digit = new int[number];
        
        //1번 기사의 약수 개수는 항상 자기 자신 1 뿐
        digit[0] = 1;
        
        //2번 기사부터 끝까지 반복문을 돌면서 약수의 개수 저장
        for(int i=1; i<digit.length; i++){
            //index 번호 대신 실제 기사 번호
            int realNumber = i+1;
            
            //어떤 수의 절반을 넘는 약수는 존재할 수 없음
            for(int j=1; j<=realNumber/2; j++){
                if(realNumber % j == 0){
                    digit[i]++;
                }
            }
            
            //약수의 개수에 realNumber 자기 자신을 포함
            //위의 반복문에서 약수 구할때 절반까지만 구했기 때문!
            digit[i]++;
        }
        
        //약수의 개수를 전부 담아둔 digit 배열 완성
        //이제 공격력 제한 수치를 넘는지 안넘는지 조사하면서 answer에 값을 더해줘야함.
        for(int i=0; i<digit.length; i++){
            if(digit[i] > limit){
                digit[i] = power;
            }
            answer += digit[i];
        }
             
        return answer;
    }
}