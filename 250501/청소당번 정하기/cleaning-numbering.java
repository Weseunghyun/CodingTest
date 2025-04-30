import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long[] counts = new long[3];
for (int i = 1; i <= n; i++) {
if (i % 2 == 0) { // 교실을 청소합니다.
counts[0]++;
} else if (i % 3 == 0) { // 복도를 청소합니다.
counts[1]++;
} else { // 화장실을 청소합니다.
counts[2]++;
}
}
System.out.println(counts[0]+" "+counts[1]+" "+counts[2]);
}
}