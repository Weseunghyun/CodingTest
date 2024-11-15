import java.util.*;

class Solution {
    //lottos가 알아볼 수 없는 수가 표기된 번호 6개
    //win_nums는 실제 로또 당첨 번호
    public int[] solution(int[] lottos, int[] win_nums) {
        //최고순위와 최저순위를 기록하는 answer 배열
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[2];
        int maxScore = 0;
        int minScore = 0;
        int score = 0;
        //일단 0을 제외하고 몇개의 번호가 존재하는지 살펴보자
        //list 변환을 안쓰고 배열에서만 문제를 풀어볼 예정
        
        for(int number : lottos){
            if(number == 0){
                continue;
            }
            for(int win : win_nums){
                if(number == win){
                    score++;
                    list.add(number);
                }
            }
        }
        
        //0을 제외한 당첨 번호 개수를 score 변수에 담았다.
        //애초에 0을 제외한 당첨 번호 개수는 최저 순위 번호 개수와 같다
        //최저 순위를 구하려면 어떻게 해야할까? 일치하는 개수가 1개 이하라면 6이다.
        //그러면 7이라는 변수를 두고 맞춘 개수 번호를 빼면 등수가 나올 것이다.
        int calcScore = 7;
        if(score < 2){
            minScore = 6;
        }else{
            //최저순위 구하기 완료
            minScore = calcScore - score;
        }
        //최저 순위를 정답 배열에 할당
        answer[1] = minScore;
        
        //이제 최고순위를 구해야함.
        //최고순위를 구하려면 현재 score 에서 0을 포함시켜서 
        //이미 당첨된 숫자를 제외하고 0자리에 할당해줘야함.
        //당첨된 숫자는 위에서 0을 제외한 수를 확인할 때 가변 리스트에 추가해주었다.
        //따라서 이번엔 0이 아닌 수라면 continue를 진행하고
        //0이라면 당첨된 숫자중 하나를 넣어야하는데 list에 있는 수는 제외하고 넣겠다.
        Loop1 : for(int number : lottos){
            //number가 0이어야함.
            if(number != 0){
                continue;
            }
            for(int win : win_nums){
                if(!list.contains(win)){
                    score++;
                    continue Loop1;
                }
            }
        }
        
        //이제 최고 순위를 나타내는 당첨 번호 개수를 구했다
        //score 는 이제 최고순위를 나타낼 수 있다.
        //이 또한 2가 넘지 않을 수 있으므로 조건문으로 체크해준다.
        if(score<2){
            maxScore = 6;
        }else{
            //최고순위 구하기 완료
            maxScore = calcScore - score;
        }
        
        answer[0] = maxScore;
        
        
        return answer;
    }
}