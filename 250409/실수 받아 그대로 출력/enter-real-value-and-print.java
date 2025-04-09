
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        d = (Math.round(d*100)/100.0);
        System.out.printf("%.2f", d);
    }
}