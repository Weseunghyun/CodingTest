import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        calculate(a,o,c);
    }

    public static void calculate(int a, char o , int c) {
        if (o == '+') {
            System.out.println(a+ " " + "+ " + c + " = " + (a+c));
        } else if (o == '-') {
            System.out.println(a+ " " + "- " + c + " = " + (a-c));
        } else if (o == '*') {
            System.out.println(a+ " " + "* " + c + " = " + (a*c));
        } else if (o == '/') {
            System.out.println(a+ " " + "/ " + c + " = " + (a/c));
        } else {
            System.out.println("False");
        }
    }
}