package Main;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        for (int i = B; i >= A; i--) {
            System.out.print(i + " ");
        }
    }
}