import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Weather[] weathers = new Weather[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            weathers[i] = new Weather(date, day, weather);
        }
        // Please write your code here.
        Arrays.sort(weathers, Comparator.comparing(a -> a.weather));

        for (Weather weather : weathers) {
            if (weather.weather.equals("Rain")) {
                weather.print();
                break;
            }
        }
    }

    public static class Weather {
        String date;
        String day;
        String weather;

        public Weather(String date, String day, String weather) {
            this.date = date;
            this.day = day;
            this.weather = weather;
        }

        public void print() {
            System.out.println(date + " " + day + " " + weather);
        }
    }
}