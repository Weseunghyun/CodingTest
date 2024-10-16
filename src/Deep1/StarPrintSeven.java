package Deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2444 별찍기
public class StarPrintSeven {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        //우선 별이 홀수개로 찍히니 홀수개로 찍는 법을 찾아야한다.
        for (int i = 0; i < n; i++) {
            for (int j = i+1;j<n;j++){
                System.out.print(" ");
            }
            for (int k = 0;k<i*2+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0;j<i+1;j++){
                System.out.print(" ");
            }
            for (int k = 0;k<(n-i)*2-3;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
