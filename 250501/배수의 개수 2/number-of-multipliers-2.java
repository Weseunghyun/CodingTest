import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int countEven = 0;

        for (int i = 1; i <= 10; i++) {
            if (in.nextInt() % 2 == 0) {
                countEven++;
            }
        }

        System.out.println(countEven);
    }
}