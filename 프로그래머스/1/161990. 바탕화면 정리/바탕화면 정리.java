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

/*
각 String 을 돌면서 시작점 끝점을 찾으면 될 일.

시작점의 행은? 가장 먼저 #이 나온 줄 + 1
시작점의 열은? 가장 맨 앞에있는 #의 순서 +1
끝점의 행은? 가장 나중에 # 이 존재하는 줄 + 1
끝점의 열은? 가장 맨 뒤에 있는 #의 순서 + 1

이걸 어떻게 찾냐?

각 정수를 두는게 낫겠죠?
int lux luy rdx rdy

가장 먼저 #이 나온 줄을 판단하는 방법?

모든 문자열의 길이는 같다.
반복은 wallpaer의 길이만큼
이중반복으로 wallpaper[i] 만큼 돌면서 찾으면 됨

각 문자열을 문자배열로 바꾸고 진행하는게 좋을듯?
문자가 #일 때 조건에 맞춰서 각 정수값들을 업데이트 해보자.

lux는 51 을 초기로 두고 진행
만약 lux > #이 나온 행 수 즉 i값 이라면라면 그 행수로 설정해줌

luy 는 wallpaper[i].length 를 초기값으로둠
만약 luy가 > #이 나온 열 수라면 해당 열 수로 업데이트

rdx는 -1 을 초기로 두고 진행
만약 rdx < #이 나온 행 인덱스 i 라면 해당 행 수로 변경

rdy도 -1을 초기로 두고 진행
만약 rdy < #이 존재하는 열 인덱스 j 라면 해당 열로 업데이트

여기서 주의할점
파일이 첫번째 칸에 존재한다면 (0,0) (1,1) 포인트 사이에 존재함.
즉 이것을 드래그한다면 0,0 1,1 까지 드래그해야된다는 것을의미
이게 무슨의미이냐?
lux, luy는 파일이 발견되는 순간의 포인트를 의미하고
rdx, rdy는 파일의 끝 포인트를 의미한다.
따라서 어떠한 문자 배열에서 파일이 존재함을 알았을 때
lux, luy는 발견한 인덱스 그 자체로 설정해야하고
rdx, rdy는 파일이 발견된 인덱스에서 1을 더해줘야 함을 의미함.

또 각 문자열의 길이를 n이라고 할 때 
파일이 마지막 인덱스 즉 n-1에서 발견된다면
끝점은 인덱스 + 1 을 해줘야하기 때문에
rdx, rdy의 조건은 인덱스 번호와 같을 때도 +1 을 해줘야함을 의미

*/
