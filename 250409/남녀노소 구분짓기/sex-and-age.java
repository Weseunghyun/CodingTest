import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==1) {
            if (b>=19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }  
        
        if (a==0) {
            if (b>=19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } 
    }
}
