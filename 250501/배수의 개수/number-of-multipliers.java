import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
        int count3 = 0;
        int count5 = 0;
        
        for (int i = 0; i < 10; i++) {
            num1 = sc.nextInt();
            if (num1 % 3 == 0) {
                count3++;
            }
            if (num1 % 5 == 0) {
                count5++;
            }
        }
        
        System.out.println(count3 + " " + count5);
    }
}