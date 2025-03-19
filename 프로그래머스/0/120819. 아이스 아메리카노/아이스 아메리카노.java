class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 0;
        
        while(true) {
            if(money < 5500) {
                answer[1] = money;
                break;
            }
            money -= 5500;
            coffee++;
        }
        answer[0] = coffee;
        return answer;
    }
}