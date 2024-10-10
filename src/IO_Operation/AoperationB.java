package IO_Operation;

import java.util.Scanner;

public class AoperationB {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
