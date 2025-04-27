import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        if (a1 > b1 && a2 > b2) {
            System.out.println(1);
        } else {
            System.out.println(0);
        } 
       
    }
}