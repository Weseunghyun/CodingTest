import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = sc.nextInt();
        int b = sc.nextInt();
        int b2 = sc.nextInt();
//        int c = sc.nextInt();

        if (a > b) {
            System.out.println("A");
        } else if (b > a) {
            System.out.println("B");
        } else {
            if (a2 > b2) {
                System.out.println("A");
            } else if (b2 > a2) {
                System.out.println("B");
            }
        } 
    }
}