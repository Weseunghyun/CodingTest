import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int a2 = sc.nextInt();
        // int b = sc.nextInt();
        // int b2 = sc.nextInt();
//        int c = sc.nextInt();

        if (a == 1) {
            if (a2 >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            } 
        } else {
            if (a2 >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } 
    }
}