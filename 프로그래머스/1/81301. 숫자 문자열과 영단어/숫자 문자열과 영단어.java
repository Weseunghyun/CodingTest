import java.util.*;
class Solution {
    public int solution(String s) {
//         List<String> list = new ArrayList<>();
//         list.add("zero");
//         list.add("one"); 
//         list.add("two"); 
//         list.add("three");
//         list.add("four"); 
//         list.add("five"); 
//         list.add("six");
//         list.add("seven"); 
//         list.add("eight"); 
//         list.add("nine");
        
//         for(int i=0; i<list.size(); i++){
//             if(s.contains(list.get(i))){
//                 s = s.replaceAll(list.get(i), String.valueOf(i));
//             }
//         }
//         return Integer.parseInt(s);
        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
    }
}