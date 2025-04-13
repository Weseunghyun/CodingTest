import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        Arrays.sort(arr);
        int a = arr[arr.length-1];
        int count = 1;
        System.out.println(zaegui(a,count,arr));
    }

    public static int zaegui(int a, int count, int[] arr) {
        int t = a*count;
        boolean isYak = true;

        for(int ar : arr) {
            if(t%ar != 0) {
                isYak = false;
                break;  
            }
        }

        if(isYak) {
            return t;
        }

        return zaegui(a, count+1, arr);
    }
}