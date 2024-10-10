package IO_Operation;

import java.util.Scanner;

public class Namuzi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        int first = (a + b) % c;
        int second = ((a%c)+(b%c)) % c;
        int third = (a * b) % c;
        int fourth = ((a%c)*(b%c)) % c;


        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }

}
