import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();
        
        int num = arr[0];
        list.add(arr[0]);
        
        for(int a : arr) {
            if(num == a) {
                continue;
            } else {
                list.add(a);
                num = a;
            }   
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

/*
스택안써도 풀 수 있지않을까? 배열을 순회하면서
일단 첫번째 순서 숫자를 저장하고 그 다음 순서가 같은 번호라면
추가하지않는다. 다른 숫자가 나오는 순서가 있다면 해당 순번 숫자로 저장하고
배열에 추가한다.
*/