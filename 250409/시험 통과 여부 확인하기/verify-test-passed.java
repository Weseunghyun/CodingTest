import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if (a>=80) {
            System.out.println("pass");
        } else {
            int s = 80-a;
            System.out.println(s+" more score");
        }
    }
}