

import java.util.HashMap;
import java.util.Map;
class Solution {
    public String[] solution(String[] players, String[] callings) {
     
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String call : callings) {
            int idx = map.get(call);
            
            String temp = players[idx];
            players[idx] = players[idx-1];
            players[idx-1] = temp;
            
            map.put(players[idx-1], map.get(call)-1);
            map.put(players[idx], map.get(players[idx-1])+1);
        }
        
        return players;
    }
    
}

// 이 방식은 시간초과가 일어남.
// class Solution {
//     public String[] solution(String[] players, String[] callings) {
//         //callings 길이만큼 순위가 바뀌는 작업이 진행됨.
//         for(String call : callings) {
//             for(int i=0; i<players.length; i++) {
//                 if(players[i].equals(call)) {
//                     String temp = players[i];
//                     players[i] = players[i-1];
//                     players[i-1] = temp;
//                     break;
//                 }
//             }
//         }
//         return players;
//     }   
// }

/*
어떤 선수가 추월하면 추월한 선수의 이름을 부른다.
players 추월하기 전 현재 상황의 등수
callings 추월하기 시작, 해설진이 부른 추월한 선수 이름 배열
원하는 것은 callings 가 끝났을 때 즉 경주가 끝났을 때 선수들의 이름을 배열에 담아 리턴

1등인 선수의 이름은 불리지않는다. 1등은 추월할 사람이 애초에 없으니.
callings 배열을 처음부터 순회하면서 어떤 작업을 진행해야할까?
불린 선수의 등수를 앞등수로 땡기고 앞등수에 있던 사람을 불린 선수의 등수로 땡겨야한다.
즉 값을 서로 뒤바꿔야한다.
이러한 상황을 기본적인 상황에서 많이 보았을때
a,b 값을 서로 바꾸려면 temp 를 이용해서 a를 저장하고 a=b, b=temp 를 사용했었다
등수가 바뀌는 경우는 callings 의 길이만큼만 바뀐다
따라서 callings 에 나온 선수 이름을 players 에서 찾고 해당 선수 앞 인덱스와 해당 선수 인덱스의 값을 바꿔보자.
이 방식을 사용하면 시간초과가 일어나는 경우가 있다. 
어떻게 이 방식을 최적화 시킬 수 있을까?

Map 을 사용해서 players 에 있는 선수들의 초기 인덱스를 저장한다
예시를 예로들면 mumu:0, soe:1, poe:2, kai:3, mine:4
callings 에 있는 선수의 이름을 통해 현재 그 선수가 있는 인덱스를 찾아낸다
예를들어 kai 라면 3에 있으니 players[2] 와 players[3] 의 값을 바꿔준다.
그 후 players[2] 의 value값은 +1, players[3] 의 value 값은 -1 로 map에 바뀐 순위를 적용시켜준다
*/