import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        
        for (int i = 1; i <= A; i++) {
            if (i % 2 == 0 && i % 4 != 0 && i / 8 % 2 == 0 && i % 7 < 4) {
                System.out.print(i + " ");
            }
        }
    }
}