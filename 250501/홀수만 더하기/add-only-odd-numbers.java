public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num % 2 != 0 && num % 3 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}