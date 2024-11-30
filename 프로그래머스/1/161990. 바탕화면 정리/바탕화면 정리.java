class Solution {
    public int[] solution(String[] wallpaper) {
  
        int lux = 51;
        int luy = wallpaper[0].length();
        int rdx = -1;
        int rdy = -1;
        for(int i=0; i<wallpaper.length; i++){
            char[] a = wallpaper[i].toCharArray();
            for(int j=0; j<a.length; j++){
                if(a[j] == '#'){
                    if(lux > i){
                        lux = i;
                    }
                    
                    if(luy > j){
                        luy = j;
                    }
                    
                    if(rdx <= i){
                        rdx = i+1;
                    }
                    
                    if(rdy <= j){
                        rdy = j+1;
                    }
                }
            }
        }
        return new int[] {lux,luy,rdx,rdy};
    }
}