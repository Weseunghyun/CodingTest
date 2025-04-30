import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        avg = (double)sum / n;
        System.out.println(sum + " " + String.format("%.1f", avg));
    }
}