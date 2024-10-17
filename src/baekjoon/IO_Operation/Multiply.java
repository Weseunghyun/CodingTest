package baekjoon.IO_Operation;

import java.util.Scanner;

//2588 곱셈
public class Multiply {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int one = b % 10;
        int ten = b/10%10;
        int hundred = b/100%10;

        System.out.println(a*one);
        System.out.println(a*ten);
        System.out.println(a*hundred);
        System.out.println(a*b);
    }
}
