import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;
        A = sc.nextInt();
        B = sc.nextInt();
        long sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        BigDecimal bd = new BigDecimal(sum);
        System.out.println((bd.divide(new BigDecimal(B - A + 1), 1, RoundingMode.HALF_UP)).doubleValue());
    }
}