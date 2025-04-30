import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cleaningCount = 0;
        int toiletCleaningCount = 0;
        int officeCleaningCount = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                cleaningCount++;
            }
            if (i % 3 == 0) {
                toiletCleaningCount++;
            }
            if (i % 12 == 0) {
                officeCleaningCount++;
            }
        }
        System.out.println(cleaningCount + " " + toiletCleaningCount + " " + officeCleaningCount);
    }
}