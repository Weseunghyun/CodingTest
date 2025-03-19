class Solution {
     public int solution(String[] babbling) {
        String[] canBabble = { "aya", "ye", "woo", "ma" };
        int answer = 0;

        for(String bab : babbling) {
            for(String can : canBabble) {
                if(bab.contains(can)) {
                    bab = bab.replace(can, " ");
                }
            }
            bab = bab.replace(" ", "");
            if(bab.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}