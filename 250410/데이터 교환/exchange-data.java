public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a=5,b=6,c=7;

        int temp = a;
        int temp2 = b;
        a=c;
        b=temp;
        c=temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}