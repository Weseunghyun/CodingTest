import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
