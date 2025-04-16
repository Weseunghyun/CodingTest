import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            persons[i] = new Person(names[i], addresses[i], regions[i]);
        }

        Arrays.sort(regions);

        for (int i = 0; i < n; i++) {
            if (persons[i].name.equals(names[n - 1])) {
                persons[i].print();
            }
        }
    }

    public static class Person {
        String name;
        String addresses;
        String region;

        public Person(String name, String addresses, String region) {
            this.name = name;
            this.addresses = addresses;
            this.region = region;
        }


        public void print() {
            System.out.println("name " + name);
            System.out.println("addr " + addresses);
            System.out.println("city " + region);
        }
    }
}