import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(isExistDay(m, d));
    }
    
    public static String isExistDay(int m, int d) {
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d>=1 && d <= 31) {
                return "Yes";
            } 
            return "No";
        } else if (m==2) {
            if (d >= 1 && d <= 28) {
                return "Yes";
            }
            return "No";
        } else {
            if (d>=1 && d <= 31) {
                return "Yes";
            }
            return "No";
        }
    }
}