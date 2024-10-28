package programmers;
import java.util.*;
public class StringSortMam {
    class Solution {
        public String[] solution(String[] strings, int n) {
            int length = strings.length;
            String[] answer = new String[length];
            List<String> list = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                list.add(strings[i].charAt(n) + strings[i]);
            }
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i).substring(1);
            }
            return answer;
        }
    }
}
