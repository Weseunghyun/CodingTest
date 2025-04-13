import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(holzzak(n));
    }

    public static int holzzak(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        
        if(n%2==1) {
            return n + holzzak(n-2);
        } else {
            return n + holzzak(n-2);
        }
    }
}