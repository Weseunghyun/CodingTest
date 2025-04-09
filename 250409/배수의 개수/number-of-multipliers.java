import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] a = new int[10];
        
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        
        int count3 = 0;
        int count5 = 0;
        
        for (int ac : a) {
            if (ac%3 == 0) {
                count3++;
            }
            if (ac%5 == 0) {
                count5++;
            }
        }

        System.out.println(count3 + " " + count5);
    }
}
