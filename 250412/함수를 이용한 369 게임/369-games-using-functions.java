import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        // Please write your code here.
        System.out.println(find(A, B));
    }

    public static int find(int a, int b) {
        int count = 0;
        for (int i=a; i<=b ;i++) {
            if(isTarget(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isTarget(int i) {
        if(i%3==0) return true;

        String s = String.valueOf(i);
        if(s.contains("3") || s.contains("6") || s.contains("9")) {
            return true;
        }

        return false;
    }
}