package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B, A;
        System.out.print("Enter the value of B: ");
        B = sc.nextInt();
        System.out.print("Enter the value of A: ");
        A = sc.nextInt();
        if (A >= B) {
            while (B <= A) {
                System.out.println(B);
                B++;
            }
        } else {
            while (A <= B) {
                System.out.println(A);
                A++;
            }
        }
    }
}