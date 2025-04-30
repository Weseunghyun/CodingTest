import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n2; i >= n; i--){
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            
        }
    }
}