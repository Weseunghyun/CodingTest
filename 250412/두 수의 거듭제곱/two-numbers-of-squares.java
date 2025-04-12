import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(multi(a,b));
    }

    private static int multi(int a, int b) {
        int total = 1;
        for (int i=0; i<b; i++) {
            total *= a;
        }
        return total;
    }
}