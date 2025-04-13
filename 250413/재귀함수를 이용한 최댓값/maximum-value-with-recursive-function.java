import java.util.Scanner;
public class Main {
    static int maxValue = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        findMax(arr,0);
        System.out.println(maxValue);
    }

    public static int findMax(int[] arr, int n) {
        if(n == arr.length) {
            return 0;
        }

        maxValue = Math.max(maxValue, arr[n]);

        return findMax(arr, n+1);
    }
}