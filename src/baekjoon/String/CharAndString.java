package baekjoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//27866 문자와 문자열
public class CharAndString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int a = Integer.parseInt(br.readLine());
        bw.write(s.charAt(a-1));
        bw.flush();
    }
}
