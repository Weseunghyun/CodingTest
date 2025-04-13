import java.util.Scanner;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        suYeol(n);
        System.out.println(count);
    }

    public static int suYeol(int n) {
        if(n == 1) {
            return 1;
        }

        count++;

        if(n%2==0) {
            return suYeol(n/2);
        } else {
            return suYeol(3*n +1);
        }
    }
}