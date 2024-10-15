package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11720 숫자의 합
public class AddNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        int result = 0;

        String s = br.readLine();

        for (int i = 0; i < a; i++) {
            result = result + Integer.parseInt(s.charAt(i) + "");
        }

        System.out.println(result);
    }
}
