class Solution {
    //number는 기사의 수, limit는 공격력 제한 수치, power는 제한 수치를 초과한 기사가 사용해야할 무기 공격력
    public int solution(int number, int limit, int power) {
        //위의 주석처리된 문제 풀이는 성능이 너무 좋게 나오지않았다.
//         //정답을 담을 정수 
//         int answer = 0;
        
//         //기사의 수만큼 약수의 개수를 담을 무언가가 필요하지 않을까?
//         int[] count = new int[number];
        
//         //1번 기사의 약수 개수는 항상 자기 자신 1 뿐
//         count[0] = 1;
        
//         //2번 기사부터 끝까지 반복문을 돌면서 약수의 개수 저장
//         for(int i=1; i<count.length; i++){
//             //index 번호 대신 실제 기사 번호
//             int realNumber = i+1;
            
//             //어떤 수의 절반을 넘는 약수는 존재할 수 없음
//             for(int j=1; j<=realNumber/2; j++){
//                 if(realNumber % j == 0){
//                     count[i]++;
//                 }
//             }
            
//             //약수의 개수에 realNumber 자기 자신을 포함
//             //위의 반복문에서 약수 구할때 절반까지만 구했기 때문!
//             count[i]++;
//         }
        
//         //약수의 개수를 전부 담아둔 digit 배열 완성
//         //이제 공격력 제한 수치를 넘는지 안넘는지 조사하면서 answer에 값을 더해줘야함.
//         for(int i=0; i<count.length; i++){
//             if(count[i] > limit){
//                 count[i] = power;
//             }
//             answer += count[i];
//         }
             
//         return answer;
        
        //다른 사람의 풀이에서 봐온 코드, 풀이 방식이 놀라워서 참고로 가져왔다.
        //count 배열은 인덱스 i가 i의 약수의 개수를 나타내게 하기위해 크기를 number+1로 설정
        int[] count = new int[number + 1];    
        
        //인덱스 count[i]는 i의 약수의 개수를 나타냄
        for (int i = 1; i <= number; i++) {
            //예시를 들어 설명하는게 빠르다. 예를들어 number가 6이라고 해보자
            //i =1 일때 number/i는 6이므로 j가 1~6까지 진행된다.
            for (int j = 1; j <= number / i; j++) {
                //그러면 count[1~6] 까지의 값이 1씩 증가한다
                //이는 1~6 숫자가 모두 1을 약수로 갖는 것을 나타낸다.
                //i가 2라면? j는 1~3까지 진행될꺼고 count[2,4,6] 의 개수가 증가한다.
                count[i * j]++;
            }
        }
        //위의 반복문으로 알 수 있었던 사실
        //어떤 수를 나누고 1~나눈수의 결과값을 곱해주면 그 수의 약수가 된다.
        //어떤 수 = 6, 나누는 수 = 2, 나눈수의 결과값 = 3, 1*2, 2*2, 3*2는 전부 어떤 수의 약수!
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }
}