package IO_Operation;

import java.util.Scanner;

public class AdvideB {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.printf("%.9f\n", a/b);
    }
}
