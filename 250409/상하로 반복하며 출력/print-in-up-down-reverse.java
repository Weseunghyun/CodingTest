import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i++) {
            int count = 1;
            if (i%2==0) {
                for (int j = 0; j < a; j++) {
                    arr[j][i] = count;
                    count++;
                }
            } else {
                for (int j = a - 1; j >= 0; j--) {
                    arr[j][i] = count;
                    count++;
                }
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
