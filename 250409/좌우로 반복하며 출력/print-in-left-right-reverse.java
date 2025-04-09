import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int[] arr = new int[a];
            int count = 1;
            for (int j = 0; j < a; j++) {
                arr[j] = count;
                count++;
            }

            if (i%2==0) {
                for (int ar : arr) {
                    System.out.print(ar);
                }
            } else {
                for (int j = a-1; j >= 0; j--) {
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }
}
