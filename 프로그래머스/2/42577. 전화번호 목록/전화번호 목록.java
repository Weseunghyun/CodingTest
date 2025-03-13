import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        boolean answer = true;
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return !answer;
            }   
        }
        
        return answer;
    }
}

/*
같은 전화번호가 중복해서 들어가있지 않으므로 무조건 특정 번호가 다른 번호의 접두어인 경우는
해당 특정 번호가 비교군이되는 다른 번호보다 길이가 짧다는 것을 의미한다.
번호는 총 1,000,000 개가 나올 수 있다. 안에있는 모든 번호를 비교할 수 있을까?
그렇게 풀었다가는 시간이 모자랄 것이다.

반복문을 돈다고 쳤을때 해당 번호가 다른번호의 접두어인지 아닌지 확인할 수 있는 방법
Arrays.sort와 startsWith 이용하기.
우선 정렬을 진행하면 사전순 정렬이 이루어지기 때문에 접두어가 존재한다면 무조건 붙어있게된다.
정렬이되어있는 것은 아닌 것 같으니 sort로 정렬하고 반복문을 돌면서 풀면된다.
*/