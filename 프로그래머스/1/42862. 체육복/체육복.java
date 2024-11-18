import java.util.*;
class Solution {
    //중점적으로 봐야할 점은 여분의 체육복을 가지고온 학생이 도난당한 경우인듯
    public int solution(int n, int[] lost, int[] reserve) {
        //일단 전체학생 수에서 도난당한 학생의 수를 뺀다
        //도난당한 학생을 제외하면 체육복이 다 있기 때문
        int answer = n-lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //우선 도난당한 학생이 reserve에 포함되어있는지 확인
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                //만약 도난당한 번호가 여분을 가지고있는 번호라면
                if(lost[i] == reserve[j]){
                    //도난 당했지만 자신의 체육복 한벌이 있으므로 도난당한 번호를 -1로 만든다.
                    //또한 해당 학생은 더이상 체육복을 빌려줄 수 없으므로 -1 로 만든다.
                    lost[i] = -1;
                    reserve[j] = -1;
                    //처음 answer가 전체 학생에서 도난당한 학생 수를 뺀 값이므로
                    //여분이 있지만 도난을 당한것이기에 자신의 번호를 답에 추가.
                    answer++;
                }
            }
        }
        
        //도난당한 학생의 앞 뒤 번호가 reserve에 존재하는지 확인
        for(int i=0; i<lost.length; i++){
            
            //lost[i] 가 -1 이라면 여분이 있지만 하나만 도난당한 번호이므로 
            //자기 체육복은 있으니 검증하지않아도됨.
            if(lost[i] == -1){
                continue;
            }
            
            //자신의 번호 앞뒤 번호를 선언
            int frontNumber = lost[i] - 1;
            int behindNumber = lost[i] + 1;
            
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == -1){
                    continue;
                }
                //도난당한 학생의 번호의 앞뒤 번호와 같은 값이 여분을 가져온 번호에 존재한다면
                if(frontNumber == reserve[j] || behindNumber == reserve[j]){
                    //answer값을 1 늘리고 여분을 가져온 학생은 -1로 만든다. (다시 빌려줄 수 없으므로)
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}