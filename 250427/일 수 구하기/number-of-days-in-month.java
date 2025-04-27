import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1 || a == 3 || a == 5 || a == 7 || a == 8 || a == 10 || a == 12) {
            System.out.println(31);
        } else if (a == 2) {
            System.out.println(28);
        } else {
            System.out.println(30);
        } 

    }
}