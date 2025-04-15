import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        int count = n;
        
        for (int i = 0; i < n; i++) {
            
            words[i] = sc.next();
            if (!words[i].startsWith(t)) {
                count--;
            }
        }
        
        int idx = 0;
        
        String[] words2 = new String[count];
        for (String w : words) {
            if (w.startsWith(t)) {
                words2[idx++] = w;
            }
        }

        Arrays.sort(words2);
        System.out.println(words2[k-1]);
    }
}