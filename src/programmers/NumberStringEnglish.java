package programmers;

import java.util.ArrayList;
import java.util.List;

public class NumberStringEnglish {

    class Solution {
        public int solution(String s) {
            List<String> arr = new ArrayList<>();
            arr.add("zero");
            arr.add("one");
            arr.add("two");
            arr.add("three");
            arr.add("four");
            arr.add("five");
            arr.add("six");
            arr.add("seven");
            arr.add("eight");
            arr.add("nine");

            for(int i=0; i<arr.size(); i++){
                if(s.contains(arr.get(i))){
                    s = s.replaceAll(arr.get(i), String.valueOf(i));
                }
            }
            return Integer.parseInt(s);
        }
    }
}
