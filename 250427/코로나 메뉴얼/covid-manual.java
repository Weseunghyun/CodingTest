import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int a2 = sc.nextInt();
        char b = sc.next().charAt(0);
        int b2 = sc.nextInt();
        char c = sc.next().charAt(0);
        int c2 = sc.nextInt();

        int count = 0;

        if (a == 'Y' && a2 >= 37) { 
            count++;
        }

        if (b == 'Y' && b2 >= 37) {
            count++;
        }

        if (c == 'Y' && c2 >= 37) {
            count++;
        }

        if (count >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}