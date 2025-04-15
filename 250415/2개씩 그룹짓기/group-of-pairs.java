import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        Integer[] answers = new Integer[n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Arrays.sort(nums);

        for (int i=0; i<n; i++) {
            answers[i] = nums[i] + nums[nums.length-1-i];
        }

        Arrays.sort(answers, Collections.reverseOrder());

        System.out.println(answers[0]);
    }
}