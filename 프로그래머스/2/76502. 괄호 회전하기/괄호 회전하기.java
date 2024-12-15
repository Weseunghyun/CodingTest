import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char[] cArr = s.toCharArray();
        int len = cArr.length;
        
        if(len == 1){
            return 0;
        }
        
        /*
        String을 활용하면 회전할 때 문자열 연산이 많아져 
        시간 효율을 높이기 위해서 LinkedList로 진행할 것임.
        */
        List<Character> list = new LinkedList<>();
        
        for (char c : cArr) {
            list.add(c);
        }
        
        for (int i = 0; i < len; i++) {

            list.add(list.get(0)); // 리스트 왼쪽 회전
            list.remove(0);
            
            //올바른 괄호문자열인지 확인
            if(isValid(list)){
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isValid(List<Character> list) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : list){
            if(c=='}' || c==']' || c==')'){
                if(stack.isEmpty()){
                    return false;
                }
                
                char p = stack.pop();
                
                if ((c == ')' && p != '(') || 
                    (c == '}' && p != '{') || 
                    (c == ']' && p != '[')) {
                    return false; 
                }
            } else {
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}

/*
회전시키는 횟수는 문자열의 길이만큼이다. 그래야 한바퀴를 돌고 돌아올 것임.
어쨌든 문자열을 회전시켜야하니 문자 배열로 변환하는게 좋을 것으로 보인다.
스택을 활용해볼까? 아니면 리스트를 활용해볼까?
스택을 활용하면 누구나 그렇게 풀 것 같으니 
스택처럼 맨앞 요소를 삭제할때도 시간복잡도가 O(1) 이고 뒤에 다시 추가할때도 O(1) 인
LinkedList를 활용해보자.
문자 배열의 길이를 len 이라는 정수 타입 변수에 담아두고 길이만큼 반복문을 돌면서
리스트를 확인해보도록 하자.

우선 리스트의 맨 앞 요소를 삭제하고 맨 뒤로 옮기는 과정을 거쳐야한다.
그런데 올바른 괄호문자열인지 아닌지는 어떻게 확인할 것인가?
살펴보면 [], {}, () 는 한 쌍이며 열린 괄호가 등장하기 전에 닫힌 괄호가 등장하면
해당 문자열은 올바르지 않은 괄호문자열이다.

왼쪽으로 회전시킨 list의 원소들을 이중반복문을 돌면서 미리 초기화해둔 Map 에 추가한다
Map 에는 [,],{,},(,) 이 key값으로 value는 Integer 값 0 으로 초기화할 것이다.
추가하는 과정에서 만약 ], }, ) 이 등장했을 때 Map의 value 가 각 쌍인 [, {, ( 의 value 보다 크다면
해당 반복문은 continue를 진행하고 다음 회전 과정으로 넘어가도록 해보자.

이 풀이 과정은 틀렸다!!! 대부분의 케이스에서는 맞게 동작하지만 {(}) 처럼 쌍이 맞지않는 경우를
잡아내지 못했다. 따라서 스택을 활용해서 다시 풀어보았다.

물론 Map을 사용하지않고 문자열을 회전시킬 LinkedList 1개, 스택 역할을할 LinkedList 1개를 사용하면
스택을 활용했을 때와 거의 비슷한 로직으로 구현할 수 있지만 그럴거면 굳이 스택을 사용하는게...

이 문제는 특히 반례를 찾는것이 가장 어려웠다. 일일이 회전시켜볼 수도 없는 노릇이니...

 "(", "[[[]", "[(])"
내가 고생한 반례는 길이가 1인 경우, 열린 괄호 여러개 닫힌 괄호 1개 (서로 쌍인 경우), 쌍이 맞지않는 경우 이다
첫번째는 len ==1 조건문으로 해결, 
두번째는 isValid 메서드에서 마지막에 바로 return true를 했었는데 두번째 예시면 옳지 않기에 stack이 비어있는 경우 true를 리턴하게 수정
마지막은 stack 을 사용해서 pop 된 열린 괄호가 현재 닫힌 괄호와 쌍이 맞는지 확인하여 해결햇다.
*/
