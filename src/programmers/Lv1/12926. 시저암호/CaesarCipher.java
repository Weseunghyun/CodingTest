package programmers;

public class CaesarCipher {
    class Solution {
        public String solution(String s, int n) {
            char[] alpha = s.toCharArray();

            Loop1 : for(int i=0; i<alpha.length; i++){
                for(int j=0; j<n; j++){
                    if(alpha[i] == 'Z' || alpha[i] == 'z'){
                        alpha[i] -= 26;
                    }
                    if(alpha[i] == ' '){
                        continue Loop1;
                    }
                    alpha[i]++;
                }
            }
            String answer = String.valueOf(alpha);
            return answer;
        }
    }
}
