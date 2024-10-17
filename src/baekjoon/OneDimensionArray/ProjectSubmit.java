package baekjoon.OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//5597 과제 안 내신 분...?
public class ProjectSubmit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] students = new int[30];
        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            students[num - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] != 1) {
                bw.write((i+1) + "\n");
            }
        }
        bw.flush();
    }
}
