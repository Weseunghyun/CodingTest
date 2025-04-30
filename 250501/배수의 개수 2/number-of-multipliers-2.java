import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, oddCount = 0;
        
        while (sc.hasNextInt()) {
            n = sc.nextInt();
            
            if (n % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println(oddCount);
    }
}