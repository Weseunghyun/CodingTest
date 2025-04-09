import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.next();

        char[] arr = a.toCharArray();

        arr[1] = 'a';

        arr[arr.length-2] = 'a';

        System.out.println(String.valueOf(arr));
    }
}
