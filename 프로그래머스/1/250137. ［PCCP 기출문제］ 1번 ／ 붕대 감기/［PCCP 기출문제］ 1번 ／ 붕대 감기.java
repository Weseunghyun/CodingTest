class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
       
        //초기값과 맞으면서 비교할 health 값
        int compareHealth = health;
        
        //붕대감기 총 시간초
        int fullTime = bandage[0];
        //초당 회복량
        int heal = bandage[1];
        //추가 회복량
        int fullTimeHeal = bandage[2];
        //현재 회복하고있는 초 수
        int nowHealTime = 0;
        
        //맨처음 공격 시도 인덱스
        int attackIdx = 0;
        //마지막 몬스터 공격시간
        int lastSecond = attacks[attacks.length-1][0];

        for(int i=0; i<=lastSecond; i++) {
            //공격당하는 순간은 스킬 발동이 불가능함. 따라서 공격 먼저 체크
            //현재 시간초와 attacks 의 공격패턴의 시간이 같다면 공격
            if(i == attacks[attackIdx][0]) {
                compareHealth -= attacks[attackIdx][1];
                nowHealTime = 0;
                attackIdx++;
                if(compareHealth <= 0) {
                    return -1;
                }
                continue;
            }
            //이제 회복을 체크할 차례, 앞단에서 공격을 테스트했으니
            //만약 이미 초기의 최대 체력이라면 회복되지않고 다음 타임으로 넘어감
            if(compareHealth == health) {
                continue;
            }
            
            //몬스터에게 공격당하는 경우, 이미 최대체력인 경우를 체크함.
            //따라서 힐하는 경우를 제시해야함.
            compareHealth += heal;
            if(compareHealth > health) {
                compareHealth = health;
            }
            nowHealTime++;
            if(nowHealTime == fullTime) {
                nowHealTime = 0;
                compareHealth += fullTimeHeal;
            }
        }
        return compareHealth;
    }
}

/*
t초 1초마다 x회복 t초 다하면 y만큼 추가 회복
최대체력 존재. 그 이상 회복 불가능
연속 성공시간은 맞으면 초기화됨
맞으면 데미지만큼 체력이 줄어듬 이때 체력 0이하되면죽음
bandage t : 시전시간, x : 1초당 회복량, y: 추가회복량
health : 최대체력
attacks : 0=공격하는 시간, 피해량
죽으면 -1 리턴

0초부터 시작해서 attacks의 마지막 초까지 반복을 진행
*/