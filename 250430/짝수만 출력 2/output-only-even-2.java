import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int AAA = sc.nextInt();
        int BBB = sc.nextInt();

        int i = AAA;
        while (i <= BBB) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}