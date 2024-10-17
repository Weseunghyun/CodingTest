package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2743 단어 길이재기
public class WorkLength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        System.out.println(s.length());
    }
}
