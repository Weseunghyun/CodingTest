package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RepeatString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int repeat = 0;
        String word = "";
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            repeat = Integer.parseInt(st.nextToken());
            word = st.nextToken();

            for (int j = 0; j < word.length(); j++) {
                for (int k = 0; k < repeat; k++) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }

    }

}
