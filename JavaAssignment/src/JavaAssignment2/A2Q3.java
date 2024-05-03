package JavaAssignment2;

import java.util.Scanner;

// Q.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class A2Q3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal time date to find simple Interset: ");
        int principal = input.nextInt();
        int time = input.nextInt();
        int rate = input.nextInt();
        int SimpleInterset = (principal * rate * time ) / 100;
        System.out.println("Simple Interset "+SimpleInterset);
    }
}
