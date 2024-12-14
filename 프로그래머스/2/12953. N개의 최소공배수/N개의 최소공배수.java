//유클리드 호제법 모르면 못푸는 문제
import java.util.*;

class Solution {
    public int solution(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;

        for (int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = (lcm * arr[i]) / gcd;
        }

        return lcm;
    }

    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}

