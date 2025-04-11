import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print(n);
    }

    public static void print(int n) {
        int total = 0;
        for(int i=1; i<=n; i++) {
            total += i;
        }
        System.out.println(total/10);
    }
}