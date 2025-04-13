import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int n = a*b*c;
        System.out.println(zarrisu(n));
    }

    public static int zarrisu(int n) {
        if(n/10 <= 0) {
            return n%10;
        }

        return n%10 + zarrisu(n/10);
    }
}