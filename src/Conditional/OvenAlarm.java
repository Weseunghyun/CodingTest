package Conditional;

import java.util.Scanner;

//2525 오븐시계
public class OvenAlarm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int cookMinute = sc.nextInt();
        int cookHour = 0;

        if (cookMinute >= 60){
            cookHour = cookMinute/60;
            hour = hour + cookHour;
            minute = minute + cookMinute%60;
            if (minute>=60){
                minute = minute-60;
                hour += 1;
            }
            if (hour>=24){
                hour = hour-24;
            }
            System.out.println(hour + " " + minute);
        }else if (cookMinute<60){
            minute = minute + cookMinute;
            if (minute>=60){
                minute = minute-60;
                hour += 1;
                if (hour == 24)
                    hour = 0;
            }
            System.out.println(hour + " " + minute);
        }
    }
}
