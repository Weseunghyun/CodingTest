import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int count = 0;
            for (int j = x; j<=y; j++) {
                if (j % 2 == 0) {
                    count+=j;
                }
            }
            System.out.println(count);
        }
    }
}
