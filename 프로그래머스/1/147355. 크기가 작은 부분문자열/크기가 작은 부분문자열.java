class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int length = p.length();
        
        char[] arr = t.toCharArray();
        
        String sample = "";
        for(int i=0; i<t.length()-length+1; i++){
            sample += arr[i];
            for(int j=1; j<length; j++){
                sample += arr[i+j];
            }
            if(Long.parseLong(sample) <= Long.parseLong(p)){
                    answer++;
            }
            sample = "";
        }
        
        return answer;
    }
}
