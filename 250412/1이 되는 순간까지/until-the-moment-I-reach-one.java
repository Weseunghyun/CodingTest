import java.util.Scanner;
public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // Please write your code here.
        print(n);
        System.out.println(count);
    }

    public static void print(int n) {
        if (n==1)  return;

        if (n%2==0) {
            print(n/2);
            count++;
        } else {
            print(n/3);
            count++;
        }
    }
}