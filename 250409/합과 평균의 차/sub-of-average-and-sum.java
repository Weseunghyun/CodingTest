

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int sum = a+b+c;
        int avg = (a+b+c)/3;
        int x = sum-avg;

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(x);
    }
}