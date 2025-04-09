import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        while (a != 25) {
            a = sc.nextInt();
            if (a < 25) {
                System.out.println("Higher");
            } else if (a > 25) {
                System.out.println("Lower");
            }
        }
        System.out.println("Good");
    }
}
