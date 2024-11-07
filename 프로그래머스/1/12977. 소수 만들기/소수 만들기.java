class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len; k++){
                    int result = nums[i] + nums[j] + nums[k];
                    int count = 0;
                    for(int x=1; x<result/2; x++){
                        if(result%x==0){
                            count++;
                        }
                    }
                    if(count==1){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}