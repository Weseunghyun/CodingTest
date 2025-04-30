import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 정수 a와 b를 BigDecimal로 변환
        BigDecimal bigA = new BigDecimal(a);
        BigDecimal bigB = new BigDecimal(b);

        // 나눗셈 수행 (소수점 21자리까지, 내림 처리)
        BigDecimal result = bigA.divide(bigB, 20, RoundingMode.DOWN);

        // 결과 출력
        System.out.println(result.toPlainString()); // 지수 표현 없이 출력
    }
}
