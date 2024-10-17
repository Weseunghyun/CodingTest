package baekjoon.Deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//3003 킹 퀸 룩 비숍 나이트 폰
public class Chess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        int[] result = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<6;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 6; i++) {
            if (chess[i] != input[i]) {
                result[i] = chess[i]-input[i];
            }
            System.out.print(result[i]+" ");
        }
    }
}
