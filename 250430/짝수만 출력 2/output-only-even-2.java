import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        int i = 2*A - 1; // 짝수 범위를 포함하는 숫자의 합을 구한다
        while(i <= B){
            if(i % 2 == 0) { // 짝수일 경우에만 출력
                System.out.print(i + " ");
            }
            i += 2; // 다음 숫자로 이동
        }
    }
}