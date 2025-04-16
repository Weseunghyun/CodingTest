import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            students[i] = new Student(name, height, weight);
        }
        // Please write your code here.
        Arrays.sort(students, Comparator.comparing(a -> a.height));

        for (int i = 0; i < n; i++) {
            students[i].print();
        }
    }

    public static class Student {
        String name;
        int height;
        int weight;

        public Student(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void print() {
            System.out.println(name + " " + height + " " + weight);
        }
    }
}