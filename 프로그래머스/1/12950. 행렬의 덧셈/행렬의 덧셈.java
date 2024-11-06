class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        //arr1의 행, 열로 반환할 2차원 배열 생성
//         int[][] answer = new int[arr1.length][arr1[0].length];
        
//          for(int i=0; i<arr1.length; i++){
//             for(int j=0; j<arr1[0].length; j++){
//                 answer[i][j] = arr1[i][j] + arr2[i][j];
//             }
//         }
        
        // answer을 생성할 때 arr1으로 만들고 arr2의값만 더해줘도된다
        //arr1의 값도 변경되어 훼손되는 문제가 있지만 코테니까 허용되는 수준이지 않을까
        int[][] answer = {};
        answer = arr1;
        
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                answer[i][j] += arr2[i][j];
            }
        }
       
        return answer;
    }
}