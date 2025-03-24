class Solution {
    public int[] solution(int brown, int yellow) {
        int row = 0;
        int col = 0;
        
        //yellow가 제곱수인 경우 정사각형인지 확인
        if(Math.sqrt(yellow) % 1 == 0) {
            int sqr = (int)Math.sqrt(yellow);
            int compare = 4 * sqr + 4;
            if(brown == compare) {
                int len = sqr + 2; 
                return new int[] {len, len};
            }
        }
        
        for(int i=1; i<=yellow/2; i++) {
            if(yellow%i == 0) {
                row = yellow/i;
                col = i;
                
                int totalRow = row+2;
                int totalCol = col+2;
                
                if((totalRow*totalCol) - yellow == brown) {
                    return new int[] {totalRow, totalCol};
                }
            }
        }
        
        return new int[] {row, col};
    }
}

/*
중요한것은 yellow의 크기다. brown은 yellow가 어떻게 배치되냐에 따라 달라지는 수일 뿐이다.
만들어지는 조건
1. 가로는 세로보다 같거나 크고 세로는 무조건 3보다 같거나 커야함. 왜? 가로가 하나뿐이어도 세로는 무조건 3개
2. yellow가 제곱수이면 정사각형일 수 있다. brown 개수가 맞아야함.
3. yellow가 홀수라면 무조건 세로는 3개이다. 그렇다면 가로는 (brown - 2) / 2 이다. 
4. yellow가 짝수라면 yellow 가 어떻게 놓이냐에 따라 brown의 개수가 달라진다.
가로가 세로보다 길게 yellow의 절반만 반복문을 돌면서 yellow/2 - i 가 가로 i가 세로가 되게 풀어보자.
*/