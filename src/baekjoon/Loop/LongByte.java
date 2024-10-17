package baekjoon.Loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//25314 코딩은 체육과목 입니다
public class LongByte {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
