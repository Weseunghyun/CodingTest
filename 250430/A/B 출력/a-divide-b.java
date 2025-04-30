import java.util.Scanner;

public class A_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        double result = (double)a / b;
        System.out.printf("%.21f\n", result);
    }
}