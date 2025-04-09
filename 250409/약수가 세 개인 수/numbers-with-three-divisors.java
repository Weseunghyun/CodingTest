import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = 0;
      
        for (int i = a; i <= b; i++) {
            int count = 1;
            for (int j = 1; j <= i/2; j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count == 3) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
