Java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num >= 0 && num <= 200) {
                sum += num;
                count++;
            }
        }
        BigDecimal average = new BigDecimal(sum).divide(new BigDecimal(count), 1, BigDecimal.ROUND_HALF_UP);
        System.out.println(sum + " " + average);
    }
}