import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isMultipleOf2or3 = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 0) || (i % 3 == 0)) {
                isMultipleOf2or3[i] = true;
            } else {
                isMultipleOf2or3[i] = false;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (isMultipleOf2or3[i]) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}