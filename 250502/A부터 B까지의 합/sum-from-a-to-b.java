import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), sum = 0;
        for (int i = A; i <= B; i++) sum += i;
        System.out.println(sum);
    }
}