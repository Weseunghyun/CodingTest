package OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//3052 나머지
public class Remain {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] compare = new int[42];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());

            compare[a%42] = 1;
        }

        for (int i = 0; i < compare.length; i++) {
            if (compare[i] == 1) {
                count++;
            }
        }

        bw.write(count + "\n");
        bw.flush();
    }

}
