import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print(n);
        System.out.println();
        printReverse(n);
    }

    public static void print(int n) {
        if (n==0) return;

        print(n-1);
        System.out.print(n + " ");
    }

    public static void printReverse(int n) {
        if (n==0) return;
        System.out.print(n + " ");
        printReverse(n-1);
    }
}