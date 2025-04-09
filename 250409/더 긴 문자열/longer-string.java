import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        int al = a.length();
        int bl = b.length();
        
        if (al>bl) {
            System.out.println(a + " "+ al);
        } else if (bl > al) {
            System.out.println(b + " " + bl);
        } else {
            System.out.println("same");
        }
    }
}
