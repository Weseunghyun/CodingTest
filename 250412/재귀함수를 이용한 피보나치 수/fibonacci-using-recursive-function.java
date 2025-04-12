import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Please write your code here.

        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }
}