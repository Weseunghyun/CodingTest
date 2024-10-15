package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//10809 알파벳 찾기
public class FindAlpha {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alpha = new int[26];
        Arrays.fill(alpha, -1);

        String s = br.readLine().toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (alpha[index] == -1) {
                alpha[index] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            System.out.print(alpha[i] + " ");
        }
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        map.put('a', -1);
//        map.put('b', -1);
//        map.put('c', -1);
//        map.put('d', -1);
//        map.put('e', -1);
//        map.put('f', -1);
//        map.put('g', -1);
//        map.put('h', -1);
//        map.put('i', -1);
//        map.put('j', -1);
//        map.put('k', -1);
//        map.put('l', -1);
//        map.put('m', -1);
//        map.put('n', -1);
//        map.put('o', -1);
//        map.put('p', -1);
//        map.put('q', -1);
//        map.put('r', -1);
//        map.put('s', -1);
//        map.put('t', -1);
//        map.put('u', -1);
//        map.put('v', -1);
//        map.put('w', -1);
//        map.put('x', -1);
//        map.put('y', -1);
//        map.put('z', -1);

//
//        String s = br.readLine().toLowerCase();
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if(map.get(c) == -1) {
//                map.put(c, i);
//            }
//        }
//
//        for(char c : map.keySet()) {
//            System.out.print(map.get(c) + " ");
//        }
    }
}
