package Conditional;

import java.util.Scanner;

//2884 알람 시계
public class Alarm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        if (minute<45){
            if ((hour-1) < 0){
                hour = 23;
                System.out.println(hour + " " +(minute + (60-45) ));
            }
            else {
                System.out.println((hour - 1) + " " + (minute + (60 - 45)));
            }
        }else if (minute >= 45){
            System.out.println(hour + " " + (minute - 45));
        }
    }
}
