package baekjoon.Conditional;

import java.util.Scanner;

public class ThreeDice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice[] = new int[3];

        // 유효한 입력을 받기 위한 루프
        for (int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
            // 입력 값이 1~6인지 체크
            if (dice[i] < 1 || dice[i] > 6) {
                System.out.println("주사위의 눈은 1부터 6까지의 숫자여야 합니다.");
                return;
            }
        }

        int money = 0;
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            money = 10000 + dice[0] * 1000;  // 같은 눈 3개
        } else if (dice[0] == dice[1] || dice[0] == dice[2] || dice[1] == dice[2]) {
            // 같은 눈 2개
            int sameDice = (dice[0] == dice[1]) ? dice[0] : (dice[0] == dice[2]) ? dice[0] : dice[1];
            money = 1000 + sameDice * 100;
        } else {
            // 모두 다른 눈
            int max = Math.max(dice[0], Math.max(dice[1], dice[2]));
            money = max * 100;
        }

        System.out.println(money);  // 최종 결과 출력
    }
}
