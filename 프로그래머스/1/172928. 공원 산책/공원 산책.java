/*
일단은 공원을 벗어나는지 이동중 장애물이 있는지 판단하는 것이 우선.
1. 시작점은 무조건 첫번째 행에 존재하는가? 아닌듯

E라면 +1 열 W라면 -1 열
N이라면 -1 행 S라면 +1 행

park.length = 행의 최대 길이
park[0].length = 열의 최대 길이

각 문자열을 문자 배열로 바꾸고 진행해보자.
S 가 존재하는 인덱스를 찾아내고 거기부터 시작해야 될듯?

routes의 길이만큼 반복문을 돌면서 위치를 옮기고
해당 위치에 도달할 수 있는지 확인해야함.

S의 인덱스를 알고 있는 상태이니
움직일 방향과 거리를 알아내고 이동하면서 X가 존재하는지 범위를 벗어나는지 확인
만약 해당된다면 움직이기 전 인덱스로 다시 돌아가고 다음 명령을 진행
방향은 문자로 거리는 숫자로 알아내야하니..
routes의 각 문자열을 " " 으로 분리하여 방향은 문자 거리는 숫자로 구분해야함

똑같은 방향이 존재할 수 있으니... Map은 쓸 수 없을 것 같고..
조건문을 사용하는 느낌으로 일단 가보자.
*/
class Solution {
    public int[] solution(String[] park, String[] routes) {

        int line = park.length; //행의 수
        int column = park[0].length(); //열의 수

        int[] sIdx = new int[2]; //시작점 행열을 담을 sIdx 생성

        Loop1 : for(int i=0; i<line; i++){
            //각 문자열 하나를 문자 배열로 변환한 후에
            char[] arr = park[i].toCharArray();

            //각 문자 배열을 돌면서 S인 시작점의 인덱스를 찾는다
            for(int j=0; j<column; j++){
                if(arr[j] == 'S'){
                    sIdx[0] = i;
                    sIdx[1] = j;

                    break Loop1;
                }
            }
        }

        for(int i=0; i<routes.length; i++){
            //공백을 기준으로 분리 0은 방향 1은 공백 2는 거리
            char[] arr = routes[i].toCharArray();
            int distance = arr[2] - '0';
            if(arr[0] == 'E'){ //동
                for(int j=0; j<distance; j++){
                    sIdx[1]++;

                    if(sIdx[1] >= column || park[sIdx[0]].charAt(sIdx[1]) == 'X'){
                        sIdx[1] = sIdx[1] - j - 1;
                        break;
                    }
                }
            } else if(arr[0] == 'W'){ //서
                for(int j=0; j<distance; j++){
                    sIdx[1]--;

                    if(sIdx[1] < 0 || park[sIdx[0]].charAt(sIdx[1]) == 'X'){
                        sIdx[1] = sIdx[1] + j + 1;
                        break;
                    }
                }
            } else if(arr[0] == 'N'){ //북
                for(int j=0; j<distance; j++){
                    sIdx[0]--;

                    if(sIdx[0] < 0 || park[sIdx[0]].charAt(sIdx[1]) == 'X'){
                        sIdx[0] = sIdx[0] + j + 1;
                        break;
                    }
                }
            } else { //남
                for(int j=0; j<distance; j++){
                    sIdx[0]++;

                    if(sIdx[0] >= line || park[sIdx[0]].charAt(sIdx[1]) == 'X'){
                        sIdx[0] = sIdx[0] - j - 1;
                        break;
                    }
                }
            }
        }

        return sIdx;
    }

}