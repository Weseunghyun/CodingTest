import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.

        Product p1 = new Product();
        Product p2 = new Product(id2, code2);
        
        p1.printProduct();
        p2.printProduct();
    }
    
    public static class Product {
        String id2;
        int code2;

        public Product() {
            this.id2 = "codetree";
            this.code2 = 50;
        }

        public Product(String id2, int code2) {
            this.id2 = id2;
            this.code2 = code2;
        }
        
        public void printProduct() {
            System.out.println("product " + code2 + " is " + id2);
        }
    }
}