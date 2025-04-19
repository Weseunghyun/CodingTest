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
        boolean isYoon = isYoonYear(y);
        
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            if (d>=1 && d <= 31) {
                if (m==1 || m==12) {
                    return "Winter";
                }
                if (m==3 || m==5) {
                    return "Spring";
                }
                if (m == 7 || m == 8) {
                    return "Summer";
                }
                if (m == 10) {
                    return "Fall";
                }
            }
            return "-1";
        } else if (m==2) {
            if (isYoon) {
                if (d >= 1 && d <= 29) {
                    return "Winter";
                }
            } else {
                if (d >= 1 && d <= 28) {
                    return "Winter";
                }
            }
            return "-1";
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            if (d>=1 && d <= 30) {
                if (m==9||m==11) {
                    return "Fall";
                }
                if (m==4) {
                    return "Spring";
                }
                if (m==6) {
                    return "Summer";
                }
            }
            return "-1";
        } else {
            return "-1";
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