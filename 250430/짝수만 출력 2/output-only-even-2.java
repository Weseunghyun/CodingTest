import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1000) {
            System.out.println("Easy");
        } else if (n >= 1000 && n < 5000) {
            System.out.println("Medium");
        } else {
            System.out.println("Hard");
        }
    }
}