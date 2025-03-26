import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);

        if(map.size() == 1) {
            return 1111 * a;
        }

        if(map.size() == 2 && map.get(a) == 1 || map.get(a) == 3) {
            int ans = 0;
            boolean th = false;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(!th && entry.getValue() == 3) {
                    ans = ans + 10 * entry.getKey();
                    th = true;
                }
                if(entry.getValue() == 1) {
                    ans += entry.getKey();
                }
            }
            return (int)Math.pow(ans,2);
        }

        if(map.size() == 2 && map.get(a) == 2) {
            if(a==b) {
                return (a+c) * Math.abs(a-c);
            } else {
                return (a+b) * Math.abs(a-b);
            }
        }

        if(map.size() == 3){
            int ans = 1;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue() == 2) {
                    continue;
                }
                ans *= entry.getKey();
            }
            return ans;
        }

        if(map.size() == 4) {
            int ans = 7;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                ans = Math.min(ans, entry.getKey());
            }
            return ans;
        }

        return answer;
    }
}
