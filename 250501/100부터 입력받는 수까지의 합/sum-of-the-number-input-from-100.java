import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = n; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}