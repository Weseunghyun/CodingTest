package programmers;

public class StringNormal {
    class Solution {
        public boolean solution(String s) {
            if(s.length() != 4 && s.length() != 6){
                return false;
            }

            try{
                Integer.parseInt(s);
            }catch (NumberFormatException e){
                return false;
            }

            return true;
        }
    }

    //정규식 사용 방식
    class Solution2 {
        public boolean solution(String s) {
            if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
            return false;
        }
    }
}
