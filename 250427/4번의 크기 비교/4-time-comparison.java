import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


        if (a > c) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (a > d) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        if (a > e) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}