import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        //배수의 개수
        int count_even=0;
        
        for(int i=1;i<=10;i++){
            if(in.nextInt()%2==0){
                count_even++;
            }
            
        }
        System.out.println(count_even);
    }
}