import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isYoonYear(a));
    }
    
    public static boolean isYoonYear(int a) {
        if (a%4 == 0) {
            return a % 100 != 0 || a % 400 == 0;
        }
        
        return false;
    }
}