import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int move : moves) {
            int idx = move - 1;
            for(int i=0; i<board.length; i++) {
                //맨 윗줄부터 아랫줄까지 내려감, 만약 0이 아닌 값을 발견했다면
                if(board[i][idx] != 0) {
                    //우선 stack이 비어있으면 push만 해준다.
                    if(stack.isEmpty()) {
                        //stack 에 해당 값을 넣어주고 해당 부분을 0으로 바꿔준다.
                        stack.push(board[i][idx]);
                        board[i][idx] = 0;
                        //break 하여 다음 move로 움직인다.
                        break;
                    } else {
                        //stack이 비어있지않다면 우선 peek 해서 값을 본다.
                        int compare = stack.peek();
                        //현재 인덱스의 값과 peek한 값이 같다면
                        if(board[i][idx] == compare) {
                            //현재 스택에 있는 값을 빼주고 2개가 사라진 것이니 answer+2 를 해준다.
                            stack.pop();
                            answer+=2;
                            board[i][idx] = 0;
                            break;
                        }
                        //peek 한 값과 현재 인덱스 값이 같지않다면 stack에 넣어주고
                        //해당 인덱스의 값을 0 으로 만들어준다.
                        stack.push(board[i][idx]);
                        board[i][idx] = 0;
                        break;
                    }
                } 
            }
        }
        return answer;
    }
}

/*
바구니의 크기는 제한이 없음
즉 하나도 안터지고 다 쌓을 수도 있다는 뜻
터트려져 사라진 인형의 개수를 return 하자
*/