import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String k = sc.next();
            int name = sc.nextInt();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            students[i] = new Student(k, name, height, weight);
        }
        // Please write your code here.
        Arrays.sort(students);

        for (int i = 0; i < n; i++) {
            students[i].print();
        }
    }

    public static class Student implements Comparable<Student>{
        String name;
        int korean;
        int english;
        int math;

        public Student(String name,int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        public void print() {
            System.out.println(name + " " + korean + " " + english + " " + math);
        }

        @Override
        public int compareTo(Student o) {
            return (this.korean + this.english + this.math) - (o.korean+ o.english+o.math);
        }
    }
}