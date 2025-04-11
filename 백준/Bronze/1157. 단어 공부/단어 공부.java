import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.next().toUpperCase().toCharArray();
        int top = 0;
        int count = 0;
        char answer = 'A';
        Map<Character, Integer> map = new HashMap<>();

        for (char a : arr) {
            map.put(a, map.getOrDefault(a, 0) + 1);
            top = Math.max(top, map.get(a));
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == top) {
                answer = entry.getKey();
                count++;
            }
        }

        if (count > 1) {
            System.out.println("?");
        } else {
            System.out.println(answer);
        }
    }
}
