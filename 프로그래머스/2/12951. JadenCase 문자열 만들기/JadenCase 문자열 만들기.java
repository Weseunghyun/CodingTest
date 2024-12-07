import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
       
        for(int i=0; i<sArr.length; i++){
            char[] cArr = sArr[i].toCharArray();
            
            for(int j=0; j<cArr.length; j++){
                if(j==0){
                    cArr[j] = Character.toUpperCase(cArr[j]);
                } else {
                    cArr[j] = Character.toLowerCase(cArr[j]);
                }
            }
            
            sb.append(cArr);
            if(i!=sArr.length-1){
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
}