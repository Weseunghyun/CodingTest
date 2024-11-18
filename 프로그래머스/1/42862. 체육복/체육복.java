import java.util.*;
class Solution {
    //중점적으로 봐야할 점은 여분의 체육복을 가지고온 학생이 도난당한 경우인듯
    public int solution(int n, int[] lost, int[] reserve) {
//         //일단 전체학생 수에서 도난당한 학생의 수를 뺀다
//         //도난당한 학생을 제외하면 체육복이 다 있기 때문
//         int answer = n-lost.length;
        
//         Arrays.sort(lost);
//         Arrays.sort(reserve);
        
//         //우선 도난당한 학생이 reserve에 포함되어있는지 확인
//         for(int i=0; i<lost.length; i++){
//             for(int j=0; j<reserve.length; j++){
//                 //만약 도난당한 번호가 여분을 가지고있는 번호라면
//                 if(lost[i] == reserve[j]){
//                     //도난 당했지만 자신의 체육복 한벌이 있으므로 도난당한 번호를 -1로 만든다.
//                     //또한 해당 학생은 더이상 체육복을 빌려줄 수 없으므로 -1 로 만든다.
//                     lost[i] = -1;
//                     reserve[j] = -1;
//                     //처음 answer가 전체 학생에서 도난당한 학생 수를 뺀 값이므로
//                     //여분이 있지만 도난을 당한것이기에 자신의 번호를 답에 추가.
//                     answer++;
//                 }
//             }
//         }
        
//         //도난당한 학생의 앞 뒤 번호가 reserve에 존재하는지 확인
//         for(int i=0; i<lost.length; i++){
            
//             //lost[i] 가 -1 이라면 여분이 있지만 하나만 도난당한 번호이므로 
//             //자기 체육복은 있으니 검증하지않아도됨.
//             if(lost[i] == -1){
//                 continue;
//             }
            
//             //자신의 번호 앞뒤 번호를 선언
//             int frontNumber = lost[i] - 1;
//             int behindNumber = lost[i] + 1;
            
//             for(int j=0; j<reserve.length; j++){
//                 if(reserve[j] == -1){
//                     continue;
//                 }
//                 //도난당한 학생의 번호의 앞뒤 번호와 같은 값이 여분을 가져온 번호에 존재한다면
//                 if(frontNumber == reserve[j] || behindNumber == reserve[j]){
//                     //answer값을 1 늘리고 여분을 가져온 학생은 -1로 만든다. (다시 빌려줄 수 없으므로)
//                     answer++;
//                     reserve[j] = -1;
//                     break;
//                 }
//             }
//         }
        
//         return answer;
        
        //훨씬 간단한 풀이방식
        //학생 수만큼의 배열을 생성한다.
        int[] people = new int[n];
        
        //우선 전체 학생이 다 입을 수 있다고 가정
        int answer = n;
        
        //잃어버린 번호 -1 을 해야 인덱스의 값이되므로 그 값을 -1 해줌
        for(int l : lost){
            people[l-1]--;
        }
        
        //여분이 있는 번호라면 +1
        for(int r : reserve){
            people[r-1]++;
        }
        
        //위의 과정을 진행하면 도난당한 학생은 -1, 여분이 있는 학생은 +1
        //도난당했지만 여분이 있는 학생은 0 으로 만들어진다.
        
        //각 학생을 검증하는 과정
        for(int i=0; i<people.length; i++){
            //만약 도난당한 학생이라면
            if(people[i] == -1){
                //만약 1번학생이었다면 인덱스에는 0으로 저장되므로 i-1 값이 0보다는 같거나 커야함
                //또 내 앞번호가 여분의 체육복이있다면 도난당했던 학생을 1 늘리고 빌려준 학생은 -1을 함
                if(i-1>=0 && people[i-1] == 1){
                    people[i]++;
                    people[i-1]--;
                //마지막 번호의 학생이라면 뒷번호가 없으므로 length보다 작고
                //내 뒷번호의 학생이 여분의 체육복이 있는경우
                }else if(i+1<people.length && people[i+1] == 1){
                    people[i]++;
                    people[i+1]--;
                //위의 경우에 전부 해당되지않는다면 빌릴 수 없는 것이므로 총학생에서 -1을 해줌.
                }else{
                    answer--;
                }
            }
        }
        
        return answer;
    }
}