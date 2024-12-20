class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                for(int k=0; k<arr2.length; k++){
                    answer[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        return answer;
    }
}

/*
우선 배열을 크기에 맞게 생성해야겠지??
곱할 수 있는 배열만 주어진다라는 말의 의미는
arr1 arr2 는 무조건 곱할 수 있으니 결과배열은 arr1의 행의 개수, arr2의 열의 개수를 갖게된다.
2차원 배열 반복을 돌면서 

*/