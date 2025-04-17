import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        boolean answer = isLinked(a,b);

        if (answer) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isLinked(int[] a, int[] b) {
        boolean isFirst = false;
        boolean isRight = true;
        int bIdx = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[0]) {
                isFirst = true;
            }

            if (isFirst) {
                if (bIdx < b.length) {
                    if (a[i] != b[bIdx]) {
                        return !isRight;
                    }
                    bIdx++;
                }
            }
        }

        if(bIdx == 0) {
            return !isRight;
        }
        return isRight;
    }
}