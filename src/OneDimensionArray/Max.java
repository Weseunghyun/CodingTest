package OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//2562 최댓값
public class Max {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] a = new int[9];
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            a[i] = n;
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < 9; i++) {
            if (a[i] > max) {
                max = a[i];
                index = (i+1);
            }
        }
        bw.write(max + "\n" + index + "\n");
        bw.flush();
    }

}
