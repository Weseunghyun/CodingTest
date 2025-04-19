import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] heights = new int[n];
        int[] weights = new int[n];
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextInt();
            people[i] = new Person(names[i], heights[i], weights[i]);
        }

        Arrays.sort(people);

        for (Person p : people) {
            p.print();
        }
    }


    public static class Person implements Comparable<Person> {

        String name;
        int height;
        int weight;

        public Person(String name, int height, int weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void print() {
            System.out.printf("%s %d %d\n", name, height, weight);
        }


        @Override
        public int compareTo(Person p) {
            if (this.height != p.height) {
                return this.height - p.height;
            }

            return p.weight - this.weight;
        }
    }
}