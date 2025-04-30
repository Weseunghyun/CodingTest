import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        for(int i=A;i<=B;i++){
            if(i%6==0 && i%8!=0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}