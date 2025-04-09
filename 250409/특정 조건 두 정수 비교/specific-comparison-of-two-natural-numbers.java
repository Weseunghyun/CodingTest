import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a<b?1:0;
        int d = a==b?1:0;
        System.out.println(c + " " + d);
    }
}