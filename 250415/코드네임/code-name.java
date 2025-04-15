import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        UserInfo[] userInfos = new UserInfo[5];
        int min = 101;
        for (int i = 0; i < 5; i++) {
            char codeName = sc.next().charAt(0);
            int score = sc.nextInt();
            min = Math.min(min, score);
            userInfos[i] = new UserInfo(codeName, score);
        }

        for (int i = 0; i < 5; i++) {
            if (userInfos[i].score == min) {
                userInfos[i].printInfo();
            }
        }

    }

    public static class UserInfo {
        char codeName;
        int score;

        public UserInfo(char codeName,int score) {
            this.codeName = codeName;
            this.score = score;
        }

        public void printInfo() {
            System.out.println(codeName + " " + score);
        }
    }
}