import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = -1;

        while (num!=0) {
            num = sc.nextInt();
            if (num != 0) {
                System.out.println(num);   
            }
        }
    }
}
