class Solution {
        public boolean solution(String s) {
//             int len = s.length();
            
//             if(len!=4 && len!=6){
//                 return false;
//             }
            
//             char[] arr = s.toCharArray();
            
//             for(char a : arr){
//                 if(!Character.isDigit(a)){
//                     return false;
//                 }
//             }
//             return true;
        
            //길이 검사까지하는것
            //중괄호 내의 숫자는 앞에오는 문자가 4글자 | 또는 6글자가 오도록
            //return s.matches("\\d{4}|\\d{6}");
            //대괄호로 숫자 범위 표현
            //return s.matches("[0-9]{4}|[0-9]{6}")


            // if(!s.matches("^[0-9]*$")){
            //     return false;
            // }
            // return true;
            
            return s.matches("\\d{4}|\\d{6}");
        }
    }