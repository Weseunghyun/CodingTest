package baekjoon.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountWord {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sentence = br.readLine();

        if (sentence.isEmpty()) {
            System.out.println(0);
        }else {
            String[] words = sentence.split(" ");
            System.out.println(words.length);
        }
    }
}
