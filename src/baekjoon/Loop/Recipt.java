package baekjoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//25304 영수증
public class Recipt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sumPrice = Integer.parseInt(br.readLine());

        int sumComp = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int price = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            sumComp += price * quantity;
        }

        System.out.println(sumPrice == sumComp ? "Yes" : "No");
    }
}
