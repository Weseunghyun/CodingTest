package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 2908 상수
public class Sangsu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int compareA = (a%10) * 100 + ((a/10)%10 * 10) + (a/100);
        int compareB = (b%10) * 100 + ((b/10)%10 * 10) + (b/100);

        if (compareA > compareB) {
            System.out.println(compareA);
        }else
            System.out.println(compareB);
    }
}
