import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        print(arr, n);
    }

    public static void print(int[] arr, int n) {
        for(int i=0; i<n*n; i++) {
            if(i!=0 && i%n == 0) {
                System.out.println();
            }
            System.out.print(arr[i%9] + " ");
        }
    }
}