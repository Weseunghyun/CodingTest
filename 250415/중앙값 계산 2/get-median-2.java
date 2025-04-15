import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        List<Integer> list = new ArrayList<>();

        // Please write your code here.
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
            if (i%2==0) {
                list.sort(null);

                System.out.print(list.get(list.size()/2)+" ");
            }
        }
    }
}