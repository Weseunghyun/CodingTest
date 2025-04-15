import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        SecretInfo secretInfo = new SecretInfo(sCode, mPoint, time);
        secretInfo.printInfo();
    }
    
    public static class SecretInfo {
        String sCode;
        char mPoint;
        int time;

        public SecretInfo(String sCode, char mPoint, int time) {
            this.sCode = sCode;
            this.mPoint = mPoint;
            this.time = time;
        }
        
        public void printInfo() {
            System.out.println("secret code : " + sCode);
            System.out.println("meeting point : " + mPoint);
            System.out.println("time : " + time);
        }
    }
}