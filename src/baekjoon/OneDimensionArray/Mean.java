package baekjoon.OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//1546 평균
public class Mean {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        double[] subject=new double[n];
        double max = 0;
        double mean = 0;
        double sum = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            subject[i] = Double.parseDouble(st.nextToken());

            if (max < subject[i]) {
                max = subject[i];
            }
        }

        for (int i = 0; i < n; i++) {
            subject[i] = subject[i]/max*100;
            sum += subject[i];
        }

        mean = (double) sum /n;
        bw.write(mean + "\n");
        bw.flush();
    }
}
