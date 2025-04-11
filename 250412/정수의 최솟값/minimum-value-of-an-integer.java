import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        findMin(a,b,c);
    }

    public static void findMin(int a, int b, int c) {
        int min = Math.min(a,b);
        int realMin = Math.min(min,c);

        System.out.println(realMin);
    }
}