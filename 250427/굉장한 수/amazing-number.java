import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();

        if ((a %2== 1 && a %3== 0)||(a %2== 0 && a %5== 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}