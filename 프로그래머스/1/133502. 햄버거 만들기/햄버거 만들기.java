import java.util.*;
class Solution {
    //1빵 2야채 3고기 1231
    public int solution(int[] ing) {
//         List<Integer> list = new ArrayList<>();
//         int answer = 0;
//         //1,2,3,1 을 찾는다
//         //answer을 1 늘리고 배열에서 없앤다! 방금 포장한 햄버거를
//         //다시 1,2,3,1 을 찾는다.
        
//         for(int i : ing){
//             list.add(i);
//             while(list.size() >= 4){
//                 int n = list.size();
//                 if(!(list.get(n-1) == 1
//                   && list.get(n-2) == 3
//                   && list.get(n-3) == 2
//                   &&list.get(n-4) == 1)){
//                     break;
//                 }
//                 for(int j=0; j<4; j++){
//                         list.remove(list.size()-1);
//                 }
//                 answer++;
//             }
//         }
//         return answer;
        
        int answer = 0;
        int[] stack = new int[ing.length];
        int sp = 0;
        
        for(int i : ing){
            stack[sp++] = i;
            if(sp>=4 && stack[sp-1] == 1
              && stack[sp-2] == 3
              && stack[sp-3] == 2
              && stack[sp-4] == 1){
                answer++;
                sp-=4;
            }
        }
        
        return answer;
    }
}