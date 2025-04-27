import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char a2 = sc.next().charAt(0);
        int b = sc.nextInt();
        char b2 = sc.next().charAt(0);
//        int c = sc.nextInt();

        if ((a >= 19 && a2 == 'M') || (b >= 19 && b2 == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
    }
}