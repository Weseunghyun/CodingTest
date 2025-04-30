import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int currNum = a;
        while (currNum <= b) {
            System.out.print(currNum + " ");
            if (currNum % 2 == 0) {
                currNum += 3;
            } else {
                currNum *= 2;
            }
        }
    }
}