class Solution {
    public int solution(int n, int m, int[] section) {
        //처음에 풀었던 오답. 이 방식은 그럴듯해 보이지만
        //m이 작고 section 사이의 거리가 넓을 때 원치않는 답을 출력함.
//          int answer = 0;
//         int max = 0;
//         int min = n;
//         for(int i=0; i<section.length; i++){
//             if(max<section[i]){
//                 max=section[i];
//             }
//             if(min>section[i]){
//                 min=section[i];
//             }
//         }
        
//         int sect = max-min+1;
        
//         return sect<=m ? 1 : (sect%m ==0 ? sect/m : sect/m+1);
        
        //롤러의 위치를 current로 두고
        //current가 sec의 값보다 작으면 한번 칠하고 sec값에서 롤러의 길이만큼 더한 후 -1을
        //빼주면 이번 반복의 롤러가 칠한 구역의 끝 sec이 나옴.
        //current는 1이 아닌 0 부터 시작했기에 -1을 빼주는모습.
        int answer = 0;
        int current = 0;
        for(int sec : section){
            if(current<sec){
                answer++;
                current = sec + m - 1;
            }
        }
        
        return answer;
    }
}