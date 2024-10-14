package OneDimensionArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//10810 공 넣기
public class GoalBall {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int number = Integer.parseInt(st.nextToken());
        int shoots = Integer.parseInt(st.nextToken());
        int[] basket = new int[number];

        for (int i = 0; i < shoots; i++) {
            st=new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());
            int ballNumber = Integer.parseInt(st.nextToken());

            for (int j = first; j <= last; j++) {
                basket[(j-1)] = ballNumber;
            }
        }

        for (int i = 0; i < number; i++) {
            bw.write(basket[i] + " ");
        }

        bw.flush();
    }

}
