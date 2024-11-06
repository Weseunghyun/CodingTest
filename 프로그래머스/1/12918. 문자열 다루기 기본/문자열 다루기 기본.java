class Solution {
        public boolean solution(String s) {
            int len = s.length();
            
            if(len!=4 && len!=6){
                return false;
            }
            
            char[] arr = s.toCharArray();
            
            for(char a : arr){
                if(!Character.isDigit(a)){
                    return false;
                }
            }
            return true;
        }
    }