import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + 8;
        int b = sc.nextInt() * 3;
        
        System.out.println(a+" * " + b + " = " + (a*b));
        System.out.println(a+" / " + b + " = " + (a/b));

    }
}