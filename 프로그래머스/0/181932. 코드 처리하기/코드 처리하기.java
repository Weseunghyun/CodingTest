class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        
        char[] chArr = code.toCharArray();
        boolean mode = false;
        
        for(int i=0; i<chArr.length; i++){
            
            if(chArr[i] == '1'){
                //해당 문자가 1이라면 모드 바꿔버리고 다음 반복으로
                mode = !mode;
                continue;
            }
            
            if(!mode) {
                //짝수 인덱스만 추가할 때
                if(i%2==0) {
                    sb.append(chArr[i]);
                }
            } else if (mode) {
                //홀수 인덱스만 추가할 때
                if(i%2==1) {
                    sb.append(chArr[i]);
                }
            }
        }
        
        String st = sb.toString();
        
        if(st.isEmpty()) {
            return "EMPTY";
        }
        
        return st;
    }
}

/*
시작할때 모드는 0 따라서 idx 가 짝수일때 sb 에 해당 값 append
1만나면 모드 1로 바뀌고 idx가 홀수일때 sb 에 해당 값 append
또 1 만나면 0으로 바뀜
언제까지?? 문자열 끝까지
1,0 으로하지말고 true false 로 나타내기로 하자
*/