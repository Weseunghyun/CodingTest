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
            boolean isSosu = true;
            for (int j=2; j<=a/2; j++) {
                if (i%j == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                int c = i;
                int sum = 0;
                while (c > 0) {
                    sum += c%10;
                    c /= 10;
                }
                if (sum % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}