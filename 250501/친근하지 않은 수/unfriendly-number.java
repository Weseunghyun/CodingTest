public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Initialize a boolean array to keep track of the prime factors of 2, 3, and 5
        boolean[] isPrimeFactor = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                isPrimeFactor[i] = true;
            }
        }
        
        // Initialize a count variable to keep track of the number of non-prime factors
        int count = 0;
        
        // Iterate through all numbers from 1 to n and increment the count for each non-prime factor
        for (int i = 1; i <= n; i++) {
            if (!isPrimeFactor[i]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}