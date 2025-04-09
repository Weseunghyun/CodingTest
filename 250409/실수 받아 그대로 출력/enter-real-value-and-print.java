
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        d = Math.round(d);
        System.out.printf("%.2f", d);
    }
}