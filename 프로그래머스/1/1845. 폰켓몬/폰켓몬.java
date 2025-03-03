import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int possibleMax = nums.length/2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        int size = set.size();
        
        if(size > possibleMax) {
            return possibleMax;
        } else {
            return size;
        }
    }
}

/*
일단 가능한 최대 많은 종류를 고를 수 있는 경우는 nums 배열의 절반
예를들어 1 2 3 4 5 가 있을 때 최대 종류는 2가 최선임
그러면 Set 에 nums 의 값들을 전부 넣고 사이즈를 잰다
그러면 내 예시에서는 5가 나올 것이고. 
만약 set의 size 가 possibleMax 값보다 크다면 possibleMax 리턴
아니라면 set size 값 리턴
*/