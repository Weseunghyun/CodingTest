import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        long temp = 0;
        while (true) {
            for (int j = 1; j <= 10; j++) {
                temp *= i++;
            }
            if (temp >= n) {
                System.out.println(i - 1);
                break;
            }
        }
    }
}