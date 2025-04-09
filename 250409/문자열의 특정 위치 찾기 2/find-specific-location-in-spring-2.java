import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] s = {"apple", "banana", "grape", "blueberry", "orange"};
        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        
        int count = 0;
        for (String s1 : s) {
            if (s1.charAt(2)==c || s1.charAt(3) == c) {
                System.out.println(s1);
                count++;
            }
        }
        System.out.println(count);
    }
}
