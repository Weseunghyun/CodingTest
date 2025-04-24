import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] arr = a.split(":");
        int i = Integer.parseInt(arr[0]);
        System.out.println((i+1) +":" + arr[1]);
    }
}