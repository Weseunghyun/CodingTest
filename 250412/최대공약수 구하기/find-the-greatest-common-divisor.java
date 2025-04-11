import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        int answer = max(n,m);
        System.out.println(answer);
    }

    public static int max(int n, int m) {
        int min = Math.min(n,m);
        int max = 0;
        for(int i=1; i<=min; i++) {
            if(n%i ==0 && m%i==0) {
                max = i;
            }
        }

        return max;
    }
}