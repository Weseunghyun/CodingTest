// import java.util.*;
// class Solution {
//     public int[] solution(int n, long left, long right) {

//         List<Integer> list = new ArrayList<>();
//         int[] answer = new int[(int) (right-left+1)];

//         if(n==1){
//             return new int[] {1};
//         }

//         list.add(1);

//         for(int i=2; i<=n; i++) {
//             int count = 0;
//             for(int j=1; j<i; j++){
//                 list.add((i-1) + (count * i), i);
//                 count++;
//             }

//             for(int k=0; k<i; k++){
//                 list.add(i);
//             }
//         }

//         for(int i=0; i<answer.length; i++){
//             answer[i] = list.get((int) ((left+i));
//         }

//         return answer;
//     }
// }

/*
n이 2인경우부터 1차원 배열의 초기값이 정해지더라
12 22 으로 시작해서 다음 숫자가 붙으면 그 숫자가 그대로 추가되고 
n크기를 가진 배열 내부에 n원소가 가득찬게 마지막 배열임
즉 n이 3이라면 123 223 333 n이 4라면 1234 2234 3334 4444이런 구조로 진행됨
n이 2보다 작은경우 큰 경우 나눠서하는 꼼수를 부려보자.
전부 추가된 상태에서 어쨌든 left, right 남기고 다 삭제를해야한다.
list 에서 left~right 값을 get으로 가져오고 answer arr에 추가하는 식으로 진행
배열을 미리 만들어두고 숫자를 추가하는 식으로 진행해야하나?
어찌저찌 리스트를 통해서 1차원 배열의 완성본을 바로 만드는데에는 성공했지만
left,right값이 너무 큰 관계로 시간초과가 발생하는 문제가 생겼다.
list를 직접 만들어서 사용하는 답은 답이 아니라고 결론지어진다...
*/

 class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left + 1)];
        
        for(int i=0; i<answer.length; i++){
            long index = left + i;
            
            int row = (int)(index/n);
            int col = (int)(index%n);
            
            int max = Math.max(row,col) + 1;
            
            answer[i] = max;
        }
        
        return answer;
    }   
 }

/*
생성되는 2차원 배열의 또 다른 규칙을 보면 행,열 인덱스 중 큰값에 +1을 한 값이다.
또 n, left~right값을 통해 2차원 배열의 행,열 인덱스를 구할 수 있다면 믿을 수 있겠니??
1차원 배열의 인덱스를 나타내는 숫자 left 에서 행의 인덱스는 left/n, 열의 인덱스는 left%n
을 통해서 2차원 배열의 인덱스를 구할 수 있다.
따지고 보면 n 은 2차원 배열의 행,열의 길이를 나타내기 때문에 가능한 일인 것 같다.
아니 이런걸 어떻게 찾아내고 생각하는거지?
아무튼 나도 정사각형인 2차원 배열의 인덱스 <-> 2차원 배열을 1차원 배열로 변환한 인덱스
서로가 서로의 인덱스를 알아낼 수 있다는 사실을 얻었다.
반대로 2차원 배열의 인덱스에서는 행인덱스 x n(행의 길이) + 열 을 통해 1차원 배열의 인덱스를
구할 수 있다.
*/