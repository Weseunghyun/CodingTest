import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 1;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
            count++;
        }
    }
}
