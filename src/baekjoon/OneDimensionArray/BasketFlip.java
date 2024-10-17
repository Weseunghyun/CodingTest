package baekjoon.OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//10811 바구니 뒤집기
public class BasketFlip {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] basket = new int[n];
        for (int i = 0; i < n; i++) {
            basket[i] = (i + 1);
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            while (last>first) {
                int temp = basket[first-1];
                basket[first-1] = basket[last-1];
                basket[last-1] = temp;
                last--;
                first++;
            }
        }

        for (int i = 0; i < n; i++) {
            bw.write(basket[i] + " ");
        }
        bw.flush();
    }

}
