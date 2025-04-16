import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.

        BombDissolution bombDissolution = new BombDissolution(uCode, lColor, time);
        bombDissolution.printBomb();
    }

    public static class BombDissolution {
        String uCode;
        char lColor;
        int time;

        public BombDissolution(String uCode, char lColor, int time) {
            this.uCode = uCode;
            this.lColor = lColor;
            this.time = time;
        }
        
        public void printBomb() {
            System.out.println("code : " + uCode);
            System.out.println("color : " + lColor);
            System.out.println("second : " + time);
        }
    }
}