import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(isExistDayAndWeather(y, m, d));
    }

    public static String isExistDayAndWeather(int y, int m, int d) {
        if (!isValidDate(y,m,d)){
            return "-1";
        }

        return getSeason(m);
    }

    private static boolean isValidDate(int y, int m, int d) {
        if (m<1 || m>12) {
            return false;
        }

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isYoonYear(y)) {
            days[1] = 29;
        }

        return d >= 1 && d <= days[m - 1];
    }


    public static String getSeason(int m) {
        if (m >= 3 && m <= 5) {
            return "Spring";
        } else if (m >= 6 && m <= 8) {
            return "Summer";
        } else if (m >= 9 && m <= 11) {
            return "Fall";
        } else {
            return "Winter"; // 12, 1, 2월
        }
    }

    public static boolean isYoonYear(int y){
        if (y%4 == 0) {
            if (y%100 == 0) {
                return y % 400 == 0;
            }
            return true;
        }
        return false;
    }
}