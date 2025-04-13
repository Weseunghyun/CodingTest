import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(arr);
        Integer[] nArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(nArr, Collections.reverseOrder());

        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        for(int i=0; i<nArr.length; i++) {
            System.out.print(nArr[i]+" ");
        }
    }
}