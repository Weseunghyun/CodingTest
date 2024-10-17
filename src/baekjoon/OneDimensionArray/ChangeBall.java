package baekjoon.OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//10813 공 바꾸기
public class ChangeBall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int number = Integer.parseInt(st.nextToken());
        int change = Integer.parseInt(st.nextToken());
        int[] basket = new int[number];

        for (int i = 0; i < number; i++) {
            basket[i] = (i+1);
        }

        for (int i = 0; i < change; i++) {
            st=new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken()) - 1;
            int last = Integer.parseInt(st.nextToken()) - 1;

            int temp = 0;
            temp = basket[first];
            basket[first] = basket[last];
            basket[last] = temp;
        }

        for (int i = 0; i < number; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
    }
}
