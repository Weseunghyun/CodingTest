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
        int tupple = sizes.length;
        int column = sizes[0].length;
        int[][] sorted = new int[tupple][column];
        int maxTupple = 0;
        int maxColumn = 0;
        for(int i=0; i<tupple; i++){
            sorted[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            sorted[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }
        
        for(int i=0; i<tupple; i++){
            if(maxTupple<sorted[i][0]){
                maxTupple = sorted[i][0];
            }
            if(maxColumn<sorted[i][1]){
                maxColumn = sorted[i][1];
            }
        }
        
        return maxTupple * maxColumn;
    }
}