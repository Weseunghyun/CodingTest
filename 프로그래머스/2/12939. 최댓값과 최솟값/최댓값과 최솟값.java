class Solution {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        
        int min = 2100000000;
        int max = -2100000000;
        
        for(String a : sArr){
            int b = Integer.parseInt(a);
            
            if(min>b){
                min = b;
            }
            
            if(max<b){
                max = b;
            }
        }
        
        
        return min + " " + max;
    }
}