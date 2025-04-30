import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i <= 100; i++) {
            String grade;
            if (i >= 90) {
                grade = "A";
            } else if (i >= 80) {
                grade = "B";
            } else if (i >= 70) {
                grade = "C";
            } else if (i >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.print(grade + " ");
        }
    }
}