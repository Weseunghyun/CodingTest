class Solution {
    public int solution(String[] babbling) {
           int answer = 0;
        //할 수 있는 단어들을 모아둔 문자열 배열을 생성
        //하지만 연속해서 같은 단어는 말할 수 없다.
        String[] canTalks = {"aya", "ye", "woo", "ma" };
        
        //babbling 에 들어있는 문자열을 전부 확인해봐야하니 반복문을 사용해볼 예정
        for(int i=0; i<babbling.length; i++){
            //babbling의 각 문자열에 무슨 작업을 해줘야할까?
            //우선 각 문자열에 반복적으로 등장하는 같은 발음이 있는지 확인한다.
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama"))
            {
                //반복 문자열이 등장한다면 안되는 것이니 다음 문자열로 넘어간다.
                continue;
            }
            
            //반복문자열이 등장하지않는다면 말할 수 있는 문자열을 담은 배열을 돌면서
            //해당 문자열을 replace를 사용하여 치환
            for(String s : canTalks){
                babbling[i] = babbling[i].replace(s, " ");
            }
            
            babbling[i] = babbling[i].replace(" ", "");
            
            //치환한 문자열의 길이가 0 이라면 전부 발음 가능한 단어였다는 뜻이므로
            //answer 의 값을 1 증가
            if(babbling[i].length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}
