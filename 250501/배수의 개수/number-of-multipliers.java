import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count3 = 0, count5 = 0;
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            
            if (num % 3 == 0) {
                count3++;
            }
            if (num % 5 == 0) {
                count5++;
            }
        }
        
        System.out.println(count3 + " " + count5);
    }
}