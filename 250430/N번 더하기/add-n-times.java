import java.util.Scanner;

public class N번더하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A, NA, N;
        
        A = sc.nextInt();
        NA = sc.nextInt();
        N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println(A + NA);
            A += NA;
        }
    }
}