import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Calculate the number of times each location needs to be cleaned
        int classroomsCleanings = (n + 1) / 2;
        int corridorsCleanings = (n + 3) / 3;
        int bathroomsCleanings = (n + 12) / 12;
        
        // Print the results
        System.out.println(classroomsCleanings + " " + corridorsCleanings + " " + bathroomsCleanings);
    }
}