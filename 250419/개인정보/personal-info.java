import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Person[] people = new Person[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            people[i] = new Person(names[i], heights[i], weights[i]);
        }

        // Please write your code here.
        Arrays.sort(people, Comparator.comparing(a -> (a.name)));

        System.out.println("name");
        extracted(people);

        System.out.println();
        Arrays.sort(people, (a, b) -> (b.height - a.height));
        System.out.println("height");
        extracted(people);
    }

    private static void extracted(Person[] people) {
        for (Person p : people) {
            p.print();
        }
    }

    public static class Person {
        String name;
        int height;
        double weight;

        public Person(String name, int height, double weight) {
            this.name = name;
            this.height = height;
            this.weight = weight;
        }

        public void print() {
            System.out.printf("%s %d %.1f\n", name, height, weight);
        }
    }
}