package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//11718 그대로 출력하기
public class PrintThat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = "";

        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
    }

}
