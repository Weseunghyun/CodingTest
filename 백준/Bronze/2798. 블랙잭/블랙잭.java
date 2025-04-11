import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //카드의 개수
        int m = sc.nextInt(); //목표 숫자
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int maxSum = arr[i] + arr[j] + arr[k];
                    if (maxSum <= m) {
                        sum = Math.max(sum, maxSum);
                    }
                }
            }
        }

        System.out.println(sum);
    }
}
