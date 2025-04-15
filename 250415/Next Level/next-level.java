import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        GameInfo gameInfo1 = new GameInfo(id, level);
        GameInfo gameInfo2 = new GameInfo();
        
        gameInfo2.printInfo();
        gameInfo1.printInfo();
    }

    public static class GameInfo {

        String id;
        int level;

        public GameInfo() {
            this.id = "codetree";
            this.level = 10;
        }

        public GameInfo(String id, int level) {
            this.id = id;
            this.level = level;
        }

        public void printInfo() {
            System.out.println("user " + id + " lv " + level);
        }
    }
}