class Solution {
    public int solution(int[][] sizes) {
        // int maxW = 0;
        // int maxH = 0;
        // int answer = 0;
        // for(int i=0; i<sizes.length; i++){
        //     if(sizes[i][1] > sizes[i][0]){
        //         int temp = sizes[i][0];
        //         sizes[i][0] = sizes[i][1];
        //         sizes[i][1] = temp;
        //     }
        //     if(maxW<sizes[i][0]){
        //         maxW = sizes[i][0];
        //     }
        //     if(maxH<sizes[i][1]){
        //         maxH = sizes[i][1];
        //     }
        // }
        // return maxW*maxH;
        
        int max = 0;
        int min = 0;
        
        for(int[] size : sizes){
            int parMax = Math.max(size[0], size[1]);
            int parMin = Math.min(size[0], size[1]);
            
            if(parMax>max){
                max = parMax;
            }
            
            if(parMin>min){
                min = parMin;
            }
        }

        return max * min;
    }
}