import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(print(n));
    }

    public static int print(int n) {
        if (n<10)  return n*n;
        return print(n/10) + (n%10) * (n%10);
    }
}