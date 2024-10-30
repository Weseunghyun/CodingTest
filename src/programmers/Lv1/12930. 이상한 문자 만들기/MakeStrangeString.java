package programmers;

public class MakeStrangeString {
    class Solution {
        public String solution(String s) {
            String[] a = s.split(" ");
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<a.length; i++){
                char[] arr = a[i].toCharArray();
                for(int j=0; j<arr.length; j++){
                    if(j%2==0){
                        sb.append(Character.toUpperCase(arr[j]));
                    }else{
                        sb.append(Character.toLowerCase(arr[j]));
                    }
                }
                if(i!=a.length-1){
                    sb.append(" ");
                }
            }
            return sb.toString();
        }
    }
}
