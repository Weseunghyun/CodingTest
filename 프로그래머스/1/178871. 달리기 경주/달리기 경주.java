/*
처음 등수 순으로 이루어진 players 배열이 존재하니
선수 이름을 key, 인덱스 + 1 을 value 로 사용하는 Map을 생성
callings 를 반복문을 돌며 해당 선수 이름을 가진 사람의 value를 가져오고
그 value 값 보다 1 작은 사람의 key 값의 value를 +1 한 후에
이름을 가진 사람의 value를 -1 해주는 순서로 진행한다.
1등인 사람의 이름은 들어가지 않으니 순위가 0위가 될 걱정은 하지 않아도 된다.
*/

import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> nameRanking = new HashMap<>(); 
    
        for(int i=0; i<players.length; i++){
            nameRanking.put(players[i], i);
        }
        
        for(int i=0; i<callings.length; i++){
            //callings 에서 언급된 역전할 사람의 순위와 이름을 가져옴
            int idx = nameRanking.get(callings[i]);
            
            String temp = players[idx - 1];
            players[idx - 1] = players[idx];
            players[idx] = temp;

            nameRanking.put(players[idx - 1], idx - 1);
            nameRanking.put(players[idx], idx);
        }
        
        return players;
    }
    
}