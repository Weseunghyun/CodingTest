package OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//10871 x보다 작은 수
public class LessthanX {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int count = 0;

        st=new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(st.nextToken());
            if (y < x) {
                a[count++] = y;
            }
        }

        for (int i = 0; i < count; i++) {
            bw.write(a[i] + " ");
        }

        bw.flush();
    }
}
