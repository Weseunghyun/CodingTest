import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] word1 = sc.next().toCharArray();
        char[] word2 = sc.next().toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean isSame = true;

        if (word1.length != word2.length){
            System.out.println("No");
            return;
        }
        
        for (int i = 0; i < word1.length; i++) {
            if (word1[i] != word2[i]) {
                isSame = false;
            }
        }

        if (isSame) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}