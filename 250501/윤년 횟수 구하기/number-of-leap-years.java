import java.util.Scanner;
 
 public class Main {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         
         int leapYearCount = 0;
         for (int i = 1; i <= n; i++) {
             if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                 leapYearCount++;
             }
         }
         
         System.out.println(leapYearCount);
     }
 }