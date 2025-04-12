import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(find(A, B));
    }

    public static int find(int a, int b) {
        int total = 0;
        for (int i=a; i<=b ;i++) {
            if (isTarget(i)) {
                total+=i;
            }
        }
        return total;
    }

    private static boolean isTarget(int i) {
        if (i < 2) return false;  // 2보다 작은 수는 소수가 아님
        for (int j=2; j<i; j++) {
            if (i%j == 0) {
                return false;
            }
        }
        return true;
    }
}