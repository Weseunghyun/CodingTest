import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);

        System.out.println(list.get(1));
    }
}