import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Calculate the number of times each location is cleaned
        int classroomCleanings = (n + 2 - 1) / 2;
        int corridorCleanings = (n + 3 - 1) / 3;
        int restroomCleanings = n / 12;
        
        // Print the number of cleanings for each location
        System.out.println(classroomCleanings + " " + corridorCleanings + " " + restroomCleanings);
    }
}