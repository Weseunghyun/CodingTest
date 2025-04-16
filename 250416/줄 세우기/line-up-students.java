import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            students[i] = new Student((i+1), height, weight);
        }

        // Please write your code here.
        Arrays.sort(students);

        for (Student s : students) {
            s.print();
        }
    }
    
    public static class Student implements Comparable<Student>{
        int num;
        int height;
        int weight;
        
        public Student(int num, int height, int weight) {
            this.num = num;
            this.height = height;
            this.weight = weight;
        }

        public void print() {
            System.out.println(height + " " + weight + " " + num);
        }
        @Override
        public int compareTo(Student o) {
            if (this.height == o.height) {
                if (this.weight == o.weight) {
                    return this.num - o.num;
                } else {
                   return o.weight - this.weight;
                }
            } else {
                return o.height - this.height;
            }
        }
    }
}