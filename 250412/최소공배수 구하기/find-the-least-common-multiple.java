import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        System.out.println(multi(n,m));

    }

    public static int multi(int n, int m) {
        if(n==m) {
            return n;
        }
        int min = (n<m)?n:m;
        int max = (n<m)?m:n;
        int count = 1;
        while(true) {
            if((min*count) % max == 0) {
                return min*count;
            }
            count++;
        }
    }
}