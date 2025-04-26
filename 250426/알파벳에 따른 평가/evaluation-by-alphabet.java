import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if (a=='S') {
            System.out.println("Superior");
        } else if (a=='A') {
            System.out.println("Excellent");
        } else if (a=='B') {
            System.out.println("Good");
        } else if (a=='C') {
            System.out.println("Usually");
        }else if (a=='D') {
            System.out.println("Effort");
        }else {
            System.out.println("Failure");
        }
    }
}