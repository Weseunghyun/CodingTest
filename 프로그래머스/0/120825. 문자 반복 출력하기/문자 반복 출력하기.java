class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        char[] arr = my_string.toCharArray();
        
        for(char a : arr) {
            for(int i=0; i<n; i++) {
                sb.append(a);
            }   
        }
        return sb.toString();
    }
}