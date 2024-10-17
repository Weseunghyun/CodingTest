package baekjoon.Loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//15552 빠른 A+B
public class FastAPlusB {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            a[i] = b+c;
        }

        for (int i = 0; i < N; i++) {
            bw.write(a[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
