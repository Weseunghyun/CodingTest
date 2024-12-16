import java.util.*;
class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int len = elements.length;
        
        //i 가 연속 부분 수열의 길이를 나타냄
        for(int i=1; i<=len; i++){
            for(int j=0; j<len; j++){
                int sum = 0;
                for(int k=j; k<j+i; k++){
                    sum += elements[k%len];
                }
                set.add(sum);
            }
        }
        
        return set.size();
    }
}
/*
1~elements의 길이가 연속 부분 수열의 길이이다.
우선 중복을 허용하지않는 Set 을 사용하고 맨 마지막의 set의 size를 리턴하면된다.

이 문제는 때로는 쓸데없는 생각 없이 바로 코딩을 해보면서 
답을 찾아가는 과정도 필요하구나 라는 생각이 들게 해주었다.
*/