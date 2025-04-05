class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            int a = arr1[i];
            int b = arr2[i];
            for(int j=0; j<n; j++) {
                if(a%2==1 || b%2==1) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
                a /= 2;
                b /= 2;
            }
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }
}