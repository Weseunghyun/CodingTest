package programmers;

public class LessRectangle {
    class Solution {
        public int solution(int[][] sizes) {
            int maxW = 0;
            int maxH = 0;
            int answer = 0;
            for(int i=0; i<sizes.length; i++){
                if(sizes[i][1] > sizes[i][0]){
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                if(maxW<sizes[i][0]){
                    maxW = sizes[i][0];
                }
                if(maxH<sizes[i][1]){
                    maxH = sizes[i][1];
                }
            }
            return maxW*maxH;
        }
    }
}
