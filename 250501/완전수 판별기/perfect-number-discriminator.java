import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == sumOfFactors(n)) {
            System.out.println("P");
        } else {
            System.out.println(n);
        }
    }
    
    private static long sumOfFactors(int n) {
        long sum = 1;
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}