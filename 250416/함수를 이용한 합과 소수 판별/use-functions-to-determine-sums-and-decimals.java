import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        int a = sc.nextInt();
        int b = sc.nextInt();

        sosu(a,b);
    }

    public static void sosu(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                int sum = digitSum(i);
                if (sum % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}